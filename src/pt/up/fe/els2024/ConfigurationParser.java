package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Commands.Command;
import pt.up.fe.els2024.Commands.CommandFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConfigurationParser {
    private final File config;

    // Build the configuration parser
    public ConfigurationParser(File file) {
        this.config = file;
    }

    public ConfigurationParser(String filePath) {
        System.out.println("File path: " + filePath);
        this.config = new File(filePath);
    }

    // Run Load class
    public List<Command> parseCommands() throws FileNotFoundException {
        List<Command> commands = new ArrayList<>();
        Yaml yaml = new Yaml();

        try {
            InputStream inputStream = new FileInputStream(config);
            List<Map<String, Object>> data = yaml.load(inputStream);

            for (Map<String, Object> command : data) {
                String type = command.keySet().iterator().next();
                Map<String, Object> args = (Map<String, Object>) command.get(type);


                Command newCommand = CommandFactory.createCommand(type, args);
                commands.add(newCommand);
            }


        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Could not find configuration: " + config);
        }

        return commands;
    }


}

