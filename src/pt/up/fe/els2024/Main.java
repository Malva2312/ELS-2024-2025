package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
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

}
}
