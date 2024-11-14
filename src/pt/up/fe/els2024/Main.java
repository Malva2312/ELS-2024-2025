package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		db
				.loadJSON()
					.from("profiling.json")
					.into("time")
				.loadXML()
				.loadYAML();
	}
}
