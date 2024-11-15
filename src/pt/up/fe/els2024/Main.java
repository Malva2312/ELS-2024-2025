package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		try {
			db.processFolders()
					.folders("assignment2Files/run1", "assignment2Files/run2", "assignment2Files/run3") // Specify folders
					.operations(() -> { // Define reusable operation sequence
						db.loadJSON()
								.from("profiling.json")
								.into("time")
								.withAttributes("time%", "seconds", "name")

								.loadXML()
								.from("vitis-report.xml")
								.into("vitis")
								.nestedIn("AreaEstimates", "Resources")

								.loadYAML()
								.from("decision_tree.yaml")
								.into("decision_tree")

								.loadYAML()
								.from("decision_tree.yaml")
								.into("decision_tree2")
								.nestedIn("params")

								.selectMax()
								.onColumn("time%")
								.onTable("time")

								.concactHorizontal()
								.toTable("final")
								.onTables("decision_tree", "decision_tree2", "time", "vitis")


								.end();
					})
					.printAll()
					.end();
			} catch (Exception e) {
				e.printStackTrace();
			}

		//TODO: Filter and SelectColumns are not tested
	}
}
