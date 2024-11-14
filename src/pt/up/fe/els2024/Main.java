package pt.up.fe.els2024;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class Main {
	public static void main(String[] args) {
		DataBaseBuilder db = new DataBaseBuilder();
		db
			.load()
				.from("data.csv")
				.into("table1")
				.withAttributes("name", "age", "city");
	}
}
