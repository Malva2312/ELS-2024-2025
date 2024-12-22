package pt.up.fe.els2024;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.parser.IParser;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.TopLevelOperation;
import pt.up.fe.els2024.Builder.DataBaseBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
	@Inject
	private IParser parser;

	public Main() {
		// EMF Registration is important,
		// otherwise cross-references (e.g., entity.getSuperType()) will always return null
		var injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
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

		DataBaseBuilder dbBuilder = new DataBaseBuilder();

		var treeIterator = resource.getAllContents();
		
		var output = new StringBuilder();

		while (treeIterator.hasNext()) {
			var element = treeIterator.next();

			EObject eObject = (EObject) element; // Cast your element to EObject

			switch (element.getClass().getSimpleName()) {
				case "ModelImpl":
					//output.append("Model");
					break;
				case "TopLevelOperationImpl":
					//output.append("TopLevelOperation");
					break;
				case "LoadJSONImpl":
					output.append(".loadJSON()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							output.append(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".into(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("attributes")) {
						Object nested = eObject.eGet(feature).toString();
							String nestedStr = (String) nested;
							String processed = nestedStr
									.replaceAll("[\\[\\]]", "") // Remove square brackets
									.replaceAll("\\s+", "");   // Remove extra spaces
							String[] parts = processed.split(","); // Split into individual elements

							// Generate output using string concatenation
							String result = ".withAttributes(";
							for (int i = 0; i < parts.length; i++) {
								result += "\"" + parts[i] + "\"";
								if (i < parts.length - 1) {
									result += ", "; // Add a comma and space between elements
								}
							}
							result += ")";
							output.append(result);
						} else if (feature.getName().equals("nested")) {
							Object nested = eObject.eGet(feature).toString();
							String nestedStr = (String) nested;
							String processed = nestedStr
									.replaceAll("[\\[\\]]", "") // Remove square brackets
									.replaceAll("\\s+", "");   // Remove extra spaces
							String[] parts = processed.split(","); // Split into individual elements

							// Generate output using string concatenation
							String result = ".nestedIn(";
							for (int i = 0; i < parts.length; i++) {
								result += "\"" + parts[i] + "\"";
								if (i < parts.length - 1) {
									result += ", "; // Add a comma and space between elements
								}
							}
							result += ")";
							output.append(result);
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "LoadXMLImpl":
					output.append(".loadXML()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							output.append(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".into(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("nested")) {
							Object nested = eObject.eGet(feature).toString();
							// Convert "[Device, Resources]" to "Device", "Resources"
							String nestedStr = (String) nested;
							String processed = nestedStr
									.replaceAll("[\\[\\]]", "") // Remove square brackets
									.replaceAll("\\s+", "");   // Remove extra spaces
							String[] parts = processed.split(","); // Split into individual elements

							// Generate output using string concatenation
							String result = ".nestedIn(";
							for (int i = 0; i < parts.length; i++) {
								result += "\"" + parts[i] + "\"";
								if (i < parts.length - 1) {
									result += ", "; // Add a comma and space between elements
								}
							}
							result += ")";
							output.append(result);
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "LoadYAMLImpl":
					output.append(".loadYAML()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							output.append(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".into(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("nested")){
							Object nested = eObject.eGet(feature).toString();
							// Convert "[Device, Resources]" to "Device", "Resources"
							String nestedStr = (String) nested;
							String processed = nestedStr
									.replaceAll("[\\[\\]]", "") // Remove square brackets
									.replaceAll("\\s+", "");   // Remove extra spaces
							String[] parts = processed.split(","); // Split into individual elements

							// Generate output using string concatenation
							String result = ".nestedIn(";
							for (int i = 0; i < parts.length; i++) {
								result += "\"" + parts[i] + "\"";
								if (i < parts.length - 1) {
									result += ", "; // Add a comma and space between elements
								}
							}
							result += ")";
							output.append(result);
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "ConcatOperationImpl":
					output.append(".concatHorizontal()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("target")) {
							output.append(".toTable(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("tables")) {
							Object nested = eObject.eGet(feature).toString();
							// Convert "[Device, Resources]" to "Device", "Resources"
							String nestedStr = (String) nested;
							String processed = nestedStr
									.replaceAll("[\\[\\]]", "") // Remove square brackets
									.replaceAll("\\s+", "");   // Remove extra spaces
							String[] parts = processed.split(","); // Split into individual elements

							// Generate output using string concatenation
							String result = ".onTables(";
							for (int i = 0; i < parts.length; i++) {
								result += "\"" + parts[i] + "\"";
								if (i < parts.length - 1) {
									result += ", "; // Add a comma and space between elements
								}
							}
							result += ")";
							output.append(result);
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "FilterOperationImpl":
					output.append("Filter");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("column")) {
							output.append(".onColumn(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".onTable(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("target")) {
							output.append(".toTable(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("condition")) {
							output.append(".where(\"" + eObject.eGet(feature) + "\", ");
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "SaveOperationImpl":
					output.append(".save()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							output.append(".to(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("format")) {
							output.append(".as(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("tables")){
							Object nested = eObject.eGet(feature).toString();
							String nestedStr = (String) nested;
							String processed = nestedStr
									.replaceAll("[\\[\\]]", "") // Remove square brackets
									.replaceAll("\\s+", "");   // Remove extra spaces
							String[] parts = processed.split(","); // Split into individual elements

							// Generate output using string concatenation
							String result = ".tables(";
							for (int i = 0; i < parts.length; i++) {
								result += "\"" + parts[i] + "\"";
								if (i < parts.length - 1) {
									result += ", "; // Add a comma and space between elements
								}
							}
							result += ")";
							output.append(result);
						}else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "PrintOperationImpl":
					//output.append("Print");
					break;
				case "PrintAllImpl":
					output.append(".printAll()");
					break;
				case "PrintTableImpl":
					output.append(".printTable()");
					break;
				case "RenameOperationImpl":
					output.append(".renameColumn()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("original")){
							output.append(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("renamed")) {
							output.append(".to(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".onTable(\"" + eObject.eGet(feature) + "\")");
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "LimitOperationImpl":
					output.append(".limit()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("start")){
							output.append(".from(" + eObject.eGet(feature) + ")");
						} else if (feature.getName().equals("end")) {
							output.append(".to(" + eObject.eGet(feature) + ")");
						} else if (feature.getName().equals("onTable")) {
							output.append(".table(\"" + eObject.eGet(feature) + "\")");
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "ArgMaxOperationImpl":
					output.append(".selectMax()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("column")){
							output.append(".onColumn(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".onTable(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("target")) {
							output.append(".toTable(\"" + eObject.eGet(feature) + "\")");
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "ArgMinOperationImpl":
					output.append(".selectMin()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("column")){
							output.append(".onColumn(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							output.append(".onTable(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("target")) {
							output.append(".toTable(\"" + eObject.eGet(feature) + "\")");
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "SelectOperationImpl":
					output.append(".select()");
				case "DropOperationImpl":
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("table")){
							output.append(".dropTable(\"" + eObject.eGet(feature) + "\")");
						} else output.append("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "ProcessFoldersOperationImpl":
					output.append("ProcessFolders");
					break;
				case "EndOperationImpl":
					output.append(".end()");
					break;
				default:
					output.append("Unknown Operation");
			}
			output.append("");
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		new Main().parse("./assignment3Files/000INPUT/example.mydsl");
	}
}
