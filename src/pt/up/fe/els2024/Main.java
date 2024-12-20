package pt.up.fe.els2024;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.parser.IParser;
import org.xtext.example.mydsl.MyDslStandaloneSetup;
import org.xtext.example.mydsl.myDsl.TopLevelOperation;
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

		DataBaseBuilder dbBuilder = new DataBaseBuilder();

		var treeIterator = resource.getAllContents();

		while (treeIterator.hasNext()) {
			var element = treeIterator.next();
			System.out.println(element);
/*
			if (element instanceof TopLevelOperation operation) {
				switch (operation.getClass().getSimpleName()) {
					case "ArgMaxOperation":
						dbBuilder.selectMax().end();
						break;
					case "ArgMinOperation":
						dbBuilder.selectMin().end();
						break;
					case "ConcatHorizontalOperation":
						dbBuilder.concactHorizontal().end();
						break;
					case "DropOperation":
						dbBuilder.drop().end();
						break;
					case "FilterOperation":
						dbBuilder.filter().end();
						break;
					case "JoinOperation":
						dbBuilder.joinTables("table1", "table2").end();
						break;
					case "LimitOperation":
						dbBuilder.limit().end();
						break;
					case "LoadJSONOperation":
						dbBuilder.loadJSON().end();
						break;
					case "LoadXMLOperation":
						dbBuilder.loadXML().end();
						break;
					case "LoadYAMLOperation":
						dbBuilder.loadYAML().end();
						break;
					case "PrintAllOperation":
						dbBuilder.printAll().end();
						break;
					case "PrintTableOperation":
						dbBuilder.printTable("tableName").end();
						break;
					case "ProcessFoldersOperation":
						dbBuilder.processFolders().end();
						break;
					case "RenameOperation":
						dbBuilder.rename().end();
						break;
					case "SaveOperation":
						dbBuilder.save().end();
						break;
					case "SelectColumnsOperation":
						dbBuilder.select().end();
						break;
					default:
						System.out.println("Unknown Operation");
				}
			}*/
		}
	}

	public static void main(String[] args) {
		new Main().parse("./assignment3Files/000INPUT/example.mydsl");
	}
}
