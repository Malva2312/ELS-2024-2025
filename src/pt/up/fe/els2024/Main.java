package pt.up.fe.els2024;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: els2024-9 <config.yaml>");
			System.exit(1);
		}

		// Load configuration
		ConfigurationParser configurationParser = new ConfigurationParser(args[0]);
	}
}
