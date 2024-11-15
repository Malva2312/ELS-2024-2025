package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		db
				.loadJSON()
					.from("profiling.json")
					.into("time")
					.withAttributes("time", "date", "name")
				.rename()
					.table("time")
					.from("time")
					.to("Time")
				.loadXML()
				.loadYAML();
	}
}
