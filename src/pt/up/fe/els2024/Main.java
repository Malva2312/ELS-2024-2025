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

		while (treeIterator.hasNext()) {
			var element = treeIterator.next();

			EObject eObject = (EObject) element; // Cast your element to EObject

			switch (element.getClass().getSimpleName()) {
				case "ModelImpl":
					//System.out.println("Model");
					break;
				case "TopLevelOperationImpl":
					//System.out.println("TopLevelOperation");
					break;
				case "LoadJSONImpl":
					System.out.println(".loadJSON()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							System.out.println(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							System.out.println(".into(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("attributes")) {
							Object nested = eObject.eGet(feature).toString();
							// Convert "[Device, Resources]" to "Device", "Resources"
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
							System.out.println(result);
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
							System.out.println(result);
						} else System.out.println("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "LoadXMLImpl":
					System.out.println(".loadXML()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							System.out.println(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							System.out.println(".into(\"" + eObject.eGet(feature) + "\")");
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
							System.out.println(result);
						} else System.out.println("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "LoadYAMLImpl":
					System.out.println(".loadYAML()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							System.out.println(".from(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							System.out.println(".into(\"" + eObject.eGet(feature) + "\")");
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
							System.out.println(result);
						} else System.out.println("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "ConcatOperationImpl":
					System.out.println(".concatHorizontal()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("target")) {
							System.out.println(".toTable(\"" + eObject.eGet(feature) + "\")");
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
							System.out.println(result);
						} else System.out.println("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "FilterOperationImpl":
					System.out.println("Filter");
					break;
				case "SaveOperationImpl":
					System.out.println(".save()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("file")) {
							System.out.println(".to(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("format")) {
							System.out.println(".as(\"" + eObject.eGet(feature) + "\")");
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
							System.out.println(result);
						}else System.out.println("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "PrintOperationImpl":
					System.out.println("Print");
					break;
				case "PrintAllOperationImpl":
					System.out.println("PrintAll");
					break;
				case "PrintTableOperationImpl":
					System.out.println("PrintTable");
					break;
				case "RenameOperationImpl":
					System.out.println("Rename");
					break;
				case "LimitOperationImpl":
					System.out.println("Limit");
					break;
				case "ArgMaxOperationImpl":
					System.out.println(".selectMax()");
					for (var feature : eObject.eClass().getEAllStructuralFeatures()) {
						if (feature.getName().equals("column")){
							System.out.println(".onColumn(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("table")) {
							System.out.println(".onTable(\"" + eObject.eGet(feature) + "\")");
						} else if (feature.getName().equals("target")) {
							System.out.println(".toTable(\"" + eObject.eGet(feature) + "\")");
						} else System.out.println("." + feature.getName() + "(\"" + eObject.eGet(feature) + "\")");
					}
					break;
				case "ArgMinOperationImpl":
					System.out.println("ArgMin");
					break;
				case "SelectOperationImpl":
					System.out.println("Select");
					break;
				case "DropOperationImpl":
					System.out.println("Drop");
					break;
				case "ProcessFoldersOperationImpl":
					System.out.println("ProcessFolders");
					break;
				case "EndOperationImpl":
					//System.out.println(".end()");
					break;
				default:
					System.out.println("Unknown Operation");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		new Main().parse("./assignment3Files/000INPUT/example.mydsl");
	}
}
