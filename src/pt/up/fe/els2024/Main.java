package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		db
				/*.loadJSON()
				.from("jsonFiles")
				.into("time")
				.withAttributes("time%", "seconds", "name")*/

				.loadXML()
				.from("assignment2Files/vitis-report.xml")
				.into("vitis")
				.nestedIn("AreaEstimates", "Resources")

				/*.loadYAML()
				.from("assignment2Files/decision_tree.yaml")
				.into("decision_tree")

				.loadYAML()
				.from("assignment2Files/decision_tree.yaml")
				.into("decision_tree2")
				.nestedIn("params")

				.selectMax()
					.onColumn("seconds")
					.onTable("time")

				.maxTimePercentagePerFile()
				.fromPath("jsonFiles")
				.toTable("max_time_summary")*/

				.printAll()
		.end();
	}
}
