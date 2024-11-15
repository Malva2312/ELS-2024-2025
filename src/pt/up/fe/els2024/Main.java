package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		db
				.loadJSON()
				.from("assignment2Files/profiling.json")
				.into("time")
				.withAttributes("time%", "seconds", "name")

				.loadXML()
				.from("assignment2Files/vitis-report.xml")
				.into("vitis")
				.nestedIn("AreaEstimates", "Resources")

				.loadYAML()
				.from("assignment2Files/decision_tree.yaml")
				.into("decision_tree")

		.end();
	}
}
