package pt.up.fe.els2024;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.parser.IParser;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import pt.up.fe.els2024.Builder.DataBaseBuilder;

import java.io.IOException;
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

		var treeIterator = resource.getAllContents();

		while(treeIterator.hasNext()) {
			var element = treeIterator.next();
/*
			if (element instanceof Entity entity){
				System.out.println("Entity: " + entity.getName());

				if (entity.getSuperType() != null) {
					System.out.println("Entity extends: " + entity.getSuperType().getName());
				}
			}*/
/*
			// Find Entity instances
			if (element instanceof Entity entity) {
				System.out.println("Found Entity: " + entity.getName());

				var superType = entity.getSuperType();

				// If superType is present in the Entity (i.e., Entity has 'extends').
				// automatically returns a reference to the corresponding node,
				// instead of just the name of the superType.
				// This happens because superType was defined in the Xtext DSL as superType=[Entity],
				// the [] creates cross-references.
				if(superType != null) {
					System.out.println("Entity extends " + entity.getSuperType().getName());
				}
*/
			}
		}

	public static void main(String[] args) {

		new Main().parse("example.mydsl");

		/*DataBaseBuilder db = new DataBaseBuilder();
		db
			.loadJSON()
			.from("assignment2Files/run1/profiling.json")
			.into("time")
			.withAttributes("time%", "seconds", "name")
			.nestedIn("functions")

			.loadXML()
			.from("assignment2Files/run1/vitis-report.xml")
			.into("vitis")
			.nestedIn("Device", "Resources")

			.loadYAML()
			.from("assignment2Files/run1/decision_tree.yaml")
			.into("decision_tree")

			.loadYAML()
			.from("assignment2Files/run1/decision_tree.yaml")
			.into("decision_tree2")
			.nestedIn("params")

			.selectMax()
			.onColumn("time%")
			.onTable("time")

			.concactHorizontal()
			.toTable("final")
			.onTables("decision_tree", "decision_tree2", "time", "vitis")

			.save()
			.tables("final")
			.to("assignment2Files/output.html")
			.as("html")

			.end();
*/
}
}
