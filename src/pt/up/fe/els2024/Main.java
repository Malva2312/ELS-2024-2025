package pt.up.fe.els2024;

import pt.up.fe.els2024.Commands.Command;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: els2024-9 <config.yaml>");
			System.exit(0);
		}

		// Load configuration
		ConfigurationParser configurationParser = new ConfigurationParser(args[0]);
		// Convert configuration file to instructions
		List<Command> commands;
		try {
			commands = configurationParser.parseCommands();
		}
		catch (FileNotFoundException | IllegalArgumentException e) {
			e.printStackTrace();
			return;
		}

		// Execute instructions
		commands.forEach(command -> {
            try {
                command.execute();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

	}
}
