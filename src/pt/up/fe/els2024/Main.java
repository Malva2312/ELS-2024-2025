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

	/**
	 * Constructor for the Main class.
	 * Initializes the injector and registers operation handlers for various operations.
	 * 
	 * The following operations are supported:
	 * - LoadJSON: Handles loading JSON data.
	 * - LoadXML: Handles loading XML data.
	 * - LoadYAML: Handles loading YAML data.
	 * - ConcatOperation: Handles concatenation operations.
	 * - FilterOperation: Handles filtering operations.
	 * - SaveOperation: Handles saving operations.
	 * - PrintOperation: Prints all data in the database.
	 * - RenameOperation: Handles renaming operations.
	 * - ArgMaxOperation: Handles operations to find the argument with the maximum value.
	 * - ArgMinOperation: Handles operations to find the argument with the minimum value.
	 * - SelectOperation: Handles selection operations.
	 * - DropOperation: Handles dropping operations.
	 * - ProcessFoldersOperation: Handles processing of folders.
	 * 
	 * Note: The LimitOperation handler is currently commented out.
	 */
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
		//operationHandlers.put(LimitOperation.class.getSimpleName(), e -> {
		//	if (e instanceof LimitOperation) handleLimitOperation(e);
		//});
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

	/**
	 * Parses the given file and processes its contents.
	 *
	 * @param filePath the path to the file to be parsed
	 * @throws RuntimeException if there are errors during parsing or if an I/O error occurs
	 */
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
			var handler = operationHandlers.get(element.eClass().getName());
			if (handler != null) {
				handler.accept(element);
				System.out.println("Handled operation: " + element.eClass().getName());
			} else {
				System.out.println("Unknown operation: " + element.eClass().getName());
			}

		}
	}

	/**
	 * Handles the loading of JSON data into the database.
	 * 
	 * This method constructs a JSON loading command using the provided EObject,
	 * appends common features to the command, and then executes the command to
	 * load the JSON data into the specified database table.
	 * 
	 * @param eObject the EObject containing the necessary information for loading JSON data.
	 *                It should have the following structural features:
	 *                - "file": the path to the JSON file to be loaded.
	 *                - "table": the name of the database table to load the data into.
	 *                - "attributes": a list of attributes to be loaded from the JSON file.
	 *                - "nested": a list of nested attributes to be loaded from the JSON file.
	 */
	private void handleLoadJSON(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadJSON()");
		appendCommonFeatures(eObject, output, "file", "table", "attributes", "nested");
		System.out.println(output);
		dataBaseBuilder.loadJSON()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.into((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.withAttributes((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("attributes"))).toArray(new String[0]))
			.nestedIn((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("nested"))).toArray(new String[0]))
			.end();
	}

	/**
	 * Handles the loading of an XML file into the database.
	 * 
	 * This method constructs a string representation of the loadXML operation
	 * and prints it to the console. It then uses the dataBaseBuilder to load
	 * the XML file specified in the given EObject into the specified table,
	 * with the specified nested elements.
	 * 
	 * @param eObject the EObject containing the necessary attributes for the loadXML operation:
	 *                - "file": the path to the XML file to be loaded
	 *                - "table": the name of the table into which the XML data will be loaded
	 *                - "nested": a list of nested elements to be considered during the load
	 */
	private void handleLoadXML(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadXML()");
		appendCommonFeatures(eObject, output, "file", "table", "nested");
		System.out.println(output);
		dataBaseBuilder.loadXML()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.into((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.nestedIn((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("nested"))).toArray(new String[0]))
			.end();
	}

	/**
	 * Handles the loading of a YAML file into the database.
	 * 
	 * This method constructs a YAML loading command using the provided EObject's
	 * attributes and prints the command to the console. It then uses the 
	 * dataBaseBuilder to load the YAML file into the specified table, with 
	 * optional nested attributes.
	 * 
	 * @param eObject the EObject containing the attributes for the YAML loading 
	 *                command. It should have the following attributes:
	 *                - "file": the path to the YAML file (String)
	 *                - "table": the name of the table to load the data into (String)
	 *                - "nested": a list of nested attributes (List<String>)
	 */
	private void handleLoadYAML(EObject eObject) {
		StringBuilder output = new StringBuilder(".loadYAML()");
		appendCommonFeatures(eObject, output, "file", "table", "nested");
		System.out.println(output);
		dataBaseBuilder.loadYAML()
			.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.into((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.nestedIn((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("nested"))).toArray(new String[0]))
			.end();
	}

	/**
	 * Handles the concatenation operation for the given EObject.
	 * This method constructs a StringBuilder with the initial value ".concatHorizontal()",
	 * appends common features from the EObject to the StringBuilder, and prints the result.
	 * It then performs a horizontal concatenation operation on the dataBaseBuilder,
	 * specifying the target table and the tables to concatenate.
	 *
	 * @param eObject the EObject containing the necessary features for the concatenation operation
	 */
	private void handleConcatOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".concatHorizontal()");
		appendCommonFeatures(eObject, output, "target", "tables");
		System.out.println(output);
		dataBaseBuilder.concatHorizontal()
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.onTables((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("tables"))).toArray(new String[0]))
			.end();
	}

	/**
	 * Handles the filter operation for the given EObject.
	 * Constructs a filter operation string and prints it to the console.
	 * Then, configures the dataBaseBuilder with the filter parameters extracted from the EObject.
	 *
	 * @param eObject the EObject containing the filter parameters
	 */
	private void handleFilterOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".filter()");
		appendCommonFeatures(eObject, output, "column", "table", "condition", "value", "target");
		System.out.println(output);
		dataBaseBuilder.filter()
			.onColumn((String) eObject.eGet(eObject.eClass().getEStructuralFeature("column")))
			.onTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.where((String) eObject.eGet(eObject.eClass().getEStructuralFeature("condition")),
				(String) eObject.eGet(eObject.eClass().getEStructuralFeature("value")))
			.end();
	}

	/**
	 * Handles the save operation for the given EObject.
	 * 
	 * This method constructs a save operation string and prints it to the console.
	 * It then uses the dataBaseBuilder to save the EObject's data to a file with a specified format.
	 * 
	 * @param eObject the EObject to be saved. It should have the following features:
	 *                - "tables": a list of table names (String)
	 *                - "file": the file path where the data should be saved (String)
	 *                - "format": the format in which the data should be saved (String)
	 */
	private void handleSaveOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".save()");
		appendCommonFeatures(eObject, output, "tables", "file", "format");
		System.out.println(output);
		dataBaseBuilder.save()
			.tables((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("tables"))).toArray(new String[0]))
			.to((String) eObject.eGet(eObject.eClass().getEStructuralFeature("file")))
			.as((String) eObject.eGet(eObject.eClass().getEStructuralFeature("format")))
			.end();
	}

	/**
	 * Handles the rename operation for a given EObject.
	 * 
	 * This method constructs a rename column operation using the provided EObject's
	 * attributes and appends common features to the output. It then prints the 
	 * constructed operation and performs the rename operation on the database.
	 * 
	 * @param eObject the EObject containing the attributes for the rename operation.
	 *                It should have the following attributes:
	 *                - "original": the original name of the column.
	 *                - "renamed": the new name of the column.
	 *                - "table": the name of the table containing the column.
	 */
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

	/**
	 * Handles the select operation for the given EObject.
	 * Constructs a select query using the features of the EObject and prints the query.
	 * Then, it configures the dataBaseBuilder with the columns, table, and target obtained from the EObject.
	 *
	 * @param eObject the EObject containing the features for the select operation
	 */
	private void handleSelectOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".select()");
		appendCommonFeatures(eObject, output, "columns", "table", "target");
		System.out.println(output);
		dataBaseBuilder
			.select((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("columns"))).toArray(new String[0]))
			.fromTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
			.toTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("target")))
			.end();

	}

	/**
	 * Handles the rename operation for the given EObject.
	 *
	 * This method constructs a rename operation string and prints it to the console.
	 * It then uses the dataBaseBuilder to perform the rename operation on the specified table.
	 *
	 * @param eObject the EObject containing the necessary attributes for the rename operation:
	 *                - "original": the original name of the column.
	 *                - "renamed": the new name of the column.
	 *                - "table": the name of the table containing the column.
	 */
	private void handleRenameOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".rename()");
		appendCommonFeatures(eObject, output, "original", "renamed", "table");
		System.out.println(output);
		dataBaseBuilder.rename()
				.from((String) eObject.eGet(eObject.eClass().getEStructuralFeature("original")))
				.to((String) eObject.eGet(eObject.eClass().getEStructuralFeature("renamed")))
				.table((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")))
				.end();
	}

	/**
	 * Handles the ArgMax operation for the given EObject.
	 * <p>
	 * This method constructs a selectMax operation string and prints it to the console.
	 * It then uses the dataBaseBuilder to perform the selectMax operation on the specified column and table,
	 * and stores the result in the target table.
	 *
	 * @param eObject the EObject containing the necessary attributes for the ArgMax operation:
	 *                - "column": the name of the column to find the maximum value.
	 *                - "table": the name of the table to search for the maximum value.
	 *                - "target": the name of the table to store the result.
	 */
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

	/**
	 * Handles the drop operation for the given EObject.
	 * This method constructs a drop table operation string and appends common features
	 * related to the table from the provided EObject. The constructed string is then printed.
	 * 
	 * @param eObject the EObject representing the table to be dropped
	 */
	private void handleDropOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".dropTable()");
		appendCommonFeatures(eObject, output, "table");
		System.out.println(output);
		dataBaseBuilder.dropTable((String) eObject.eGet(eObject.eClass().getEStructuralFeature("table")));
	}

	/**
	 * Handles the process folders operation for the given EObject.
	 * This method constructs a string representation of the operation
	 * and prints it to the console. The actual implementation of the
	 * process folders operation is yet to be completed.
	 *
	 * @param eObject the EObject containing the data for the operation
	 */
	private void handleProcessFoldersOperation(EObject eObject) {
		StringBuilder output = new StringBuilder(".processFolders()");
		appendCommonFeatures(eObject, output, "folders", "with");
		System.out.println(output);
		dataBaseBuilder.processFolders()
			.folders((String[]) ((List<?>) eObject.eGet(eObject.eClass().getEStructuralFeature("folders"))).toArray(new String[0]))
			.operations(() -> {
				System.out.println("Processing folders... Not implemented yet: difficult to implement");
			})
			.end();
		 */
	}

	/**
	 * Appends the common features of the given EObject to the provided StringBuilder.
	 * 
	 * @param eObject the EObject whose features are to be appended
	 * @param output the StringBuilder to which the features will be appended
	 * @param featureNames the names of the features to be appended
	 */
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
