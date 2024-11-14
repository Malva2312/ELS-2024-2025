package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		db
			.load()
				.fromXML("vitis-report.xml")
				.extract("AreaEstimates", "Resources")
				.into("Visits")
			.load()
				.fromYAML("decision_tree.yaml")
				.extract("params")
				.into("tree")
			.load()
				.fromJSON("profiling.json")
				.extract("functions", )
	}
}
