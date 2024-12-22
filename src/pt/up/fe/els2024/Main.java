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
			if (e instanceof PrintOperation) System.out.println(".printAll()");
		});
		operationHandlers.put(PrintTable.class.getSimpleName(), e -> {
			if (e instanceof PrintTable) System.out.println(".printTable()");
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
		// Use dataBaseBuilder here if needed
	}

	private void handleLoadXML(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadXML()");
		appendCommonFeatures(eObject, output, "file", "table", "nested");
		System.out.println(output);
	}

	private void handleLoadYAML(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadYAML()");
		appendCommonFeatures(eObject, output, "file", "table", "nested");
		System.out.println(output);
	}

	private void handleConcatOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".concatHorizontal()");
		appendCommonFeatures(eObject, output, "target", "tables");
		System.out.println(output);
	}

	private void handleFilterOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".filter()");
		appendCommonFeatures(eObject, output, "column", "table", "condition", "value", "target");
		System.out.println(output);
	}

	private void handleSaveOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".save()");
		appendCommonFeatures(eObject, output, "tables", "file", "format");
		System.out.println(output);
	}

	private void handleRenameOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".renameColumn()");
		appendCommonFeatures(eObject, output, "original", "renamed", "table");
		System.out.println(output);
	}

	private void handleLimitOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".limit()");
		appendCommonFeatures(eObject, output, "start", "end", "table");
		System.out.println(output);
	}

	private void handleArgMaxOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".selectMax()");
		appendCommonFeatures(eObject, output, "column", "table", "target");
		System.out.println(output);
	}

	private void handleArgMinOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".selectMin()");
		appendCommonFeatures(eObject, output, "column", "table", "target");
		System.out.println(output);
	}

	private void handleSelectOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".select()");
		appendCommonFeatures(eObject, output, "columns", "table", "target");
		System.out.println(output);
	}

	private void handleDropOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".dropTable()");
		appendCommonFeatures(eObject, output, "table");
		System.out.println(output);
	}

	private void handleProcessFoldersOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".processFolders()");
		appendCommonFeatures(eObject, output, "folders", "with");
		System.out.println(output);
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
