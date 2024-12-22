package pt.up.fe.els2024;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.parser.IParser;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import pt.up.fe.els2024.Builder.DataBaseBuilder;


import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.xtext.example.mydsl.myDsl.*;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class Main {
	@Inject
	private IParser parser;

	private final Map<String, Consumer<EObject>> operationHandlers = new HashMap<>();
	private final DataBaseBuilder dataBaseBuilder = new DataBaseBuilder();

	public Main() {
		var injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);

		operationHandlers.put(LoadJSON.class.getSimpleName(), e -> {
			if (e instanceof LoadJSON) handleLoadJSON(e);
		});
		operationHandlers.put(LoadXML.class.getSimpleName(), e -> {
			if (e instanceof LoadXML) handleLoadXML(e);
		});
		operationHandlers.put(LoadYAML.class.getSimpleName(), e -> {
			if (e instanceof LoadYAML) handleLoadYAML(e);
		});
		operationHandlers.put(ConcatOperation.class.getSimpleName(), e -> {
			if (e instanceof ConcatOperation) handleConcatOperation(e);
		});
		operationHandlers.put(FilterOperation.class.getSimpleName(), e -> {
			if (e instanceof FilterOperation) handleFilterOperation(e);
		});
		operationHandlers.put(SaveOperation.class.getSimpleName(), e -> {
			if (e instanceof SaveOperation) handleSaveOperation(e);
		});
		operationHandlers.put(PrintOperation.class.getSimpleName(), e -> {
			if (e instanceof PrintOperation) {
				System.out.println(".printAll()");
				dataBaseBuilder.printAll().end();
			}
		});
		operationHandlers.put(RenameOperation.class.getSimpleName(), e -> {
			if (e instanceof RenameOperation) handleRenameOperation(e);
		});
		operationHandlers.put(LimitOperation.class.getSimpleName(), e -> {
			if (e instanceof LimitOperation) handleLimitOperation(e);
		});
		operationHandlers.put(ArgMaxOperation.class.getSimpleName(), e -> {
			if (e instanceof ArgMaxOperation) handleArgMaxOperation(e);
		});
		operationHandlers.put(ArgMinOperation.class.getSimpleName(), e -> {
			if (e instanceof ArgMinOperation) handleArgMinOperation(e);
		});
		operationHandlers.put(SelectOperation.class.getSimpleName(), e -> {
			if (e instanceof SelectOperation) handleSelectOperation(e);
		});
		operationHandlers.put(DropOperation.class.getSimpleName(), e -> {
			if (e instanceof DropOperation) handleDropOperation(e);
		});
		operationHandlers.put(ProcessFoldersOperation.class.getSimpleName(), e -> {
			if (e instanceof ProcessFoldersOperation) handleProcessFoldersOperation(e);
		});
	}

	public void parse(String filePath) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createFileURI(filePath));
		try {
			resource.load(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		var errors = resource.getErrors();
		if (!errors.isEmpty()) {
			var message = "There were errors:\n" + errors.stream()
					.map(Object::toString)
					.collect(Collectors.joining("\n- ", "- ", "\n"));
			throw new RuntimeException(message);
		}

		var treeIterator = resource.getAllContents();
		while (treeIterator.hasNext()) {
			var element = treeIterator.next();

			System.out.println("Element: " + element.eClass().getName());
			var handler = operationHandlers.get(element);
			if (handler != null) {
				handler.accept(element);
			} else {
				System.out.println("Unknown operation: " + element.eClass().getName());
			}

		}
	}

	private void handleLoadJSON(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadJSON()");
		appendCommonFeatures(eObject, output, "file", "table", "attributes", "nested");
		System.out.println(output);
		dataBaseBuilder.loadJSON()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.into((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.withAttributes((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("attributes"))).toArray(new String[0]))
			.nestedIn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("nested")))
			.end();
	}

	private void handleLoadXML(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadXML()");
		appendCommonFeatures(eObject, output, "file", "table", "nested");
		System.out.println(output);
		dataBaseBuilder.loadXML()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.into((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.nestedIn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("nested")))
			.end();
	}

	private void handleLoadYAML(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadYAML()");
		appendCommonFeatures(eObject, output, "file", "table", "nested");
		System.out.println(output);
		dataBaseBuilder.loadYAML()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.into((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.nestedIn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("nested")))
			.end();
	}

	private void handleConcatOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".concatHorizontal()");
		appendCommonFeatures(eObject, output, "target", "tables");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.concatHorizontal()
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.onTables((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("tables"))).toArray(new String[0]))
			.end();
	*/
	}

	private void handleFilterOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".filter()");
		appendCommonFeatures(eObject, output, "column", "table", "condition", "value", "target");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.filter()
			.onColumn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("column")))
			.onTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.withCondition((String) eObject.eGet(eObject.eClass().getEStructuralFeature("condition")))
			.withValue((String) eObject.eGet(eObject.eClass().getEStructuralFeature("value")))
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.end();
		*/
	}

	private void handleSaveOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".save()");
		appendCommonFeatures(eObject, output, "tables", "file", "format");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.save()
			.fromTables((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("tables"))).toArray(new String[0]))
			.toFile((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.withFormat((String) eObject.eGet(eObject.eClass().getEStructuralFeature("format")))
			.end();
			*/
	}

	private void handleRenameOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".renameColumn()");
		appendCommonFeatures(eObject, output, "original", "renamed", "table");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.renameColumn()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("original")))
			.to((String) eObject.eGet(eObject.eClass().getEStructuralFeature("renamed")))
			.onTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.end();
		*/
	}

	private void handleLimitOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".limit()");
		appendCommonFeatures(eObject, output, "start", "end", "table");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.limit()
			.from((Integer) eObject.eGet(eObject.eClass().getEStructuralFeature("start")))
			.to((Integer) eObject.eGet(eObject.eClass().getEStructuralFeature("end")))
			.onTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.end();
		 */
	}

	private void handleArgMaxOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".selectMax()");
		appendCommonFeatures(eObject, output, "column", "table", "target");
		System.out.println(output);
		dataBaseBuilder.selectMax()
			.onColumn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("column")))
			.onTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.end();
	}

	private void handleArgMinOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".selectMin()");
		appendCommonFeatures(eObject, output, "column", "table", "target");
		System.out.println(output);
		dataBaseBuilder.selectMin()
			.onColumn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("column")))
			.onTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.end();
	}

	private void handleSelectOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".select()");
		appendCommonFeatures(eObject, output, "columns", "table", "target");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.select()
			.columns((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("columns"))).toArray(new String[0]))
			.fromTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.end();
		*/
	}

	private void handleDropOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".dropTable()");
		appendCommonFeatures(eObject, output, "table");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.dropTable()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.end();
		 */
	}

	private void handleProcessFoldersOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".processFolders()");
		appendCommonFeatures(eObject, output, "folders", "with");
		System.out.println(output);
		/* TODO: Implement this
		dataBaseBuilder.processFolders()
			.fromFolders((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("folders"))).toArray(new String[0]))
			.with((String) eObject.eGet(eObject.eClass().getEStructuralFeature("with")))
			.end();
		 */
	}

	private void appendCommonFeatures(EObject eObject, StringBuilder output, String... featureNames) {
		for (String featureName : featureNames) {
			var feature = eObject.eClass().getEStructuralFeature(featureName);
			if (feature != null) {
				var value = eObject.eGet(feature);
				if (value instanceof List<?> listValue) {
					output.append(".").append(featureName).append("(")
							.append(String.join(", ", listValue.stream()
									.map(String::valueOf).toArray(String[]::new)))
							.append(")");
				} else {
					output.append(".").append(featureName).append("(\"").append(value).append("\")");
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().parse("./assignment3Files/000INPUT/example.mydsl");
	}
}
