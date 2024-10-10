package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Commands.Command;
import pt.up.fe.els2024.Commands.CommandFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConfigurationParser {
    private final File file;

    // Build the configuration parser
    public ConfigurationParser(File file) {
        this.file = file;
    }

    public ConfigurationParser(String filePath) {
        this(new File(filePath));
    }

    // Run Load class
    public List<Command> parseCommands() throws FileNotFoundException {
        List<Command> commands = new ArrayList<>();
        Yaml yaml = new Yaml();

        try (InputStream inputStream = new FileInputStream(this.file)) {
            Iterable<Object> yamlObjects = yaml.loadAll(inputStream);

            // Load, rename, save
            for (Object yamlObject : yamlObjects) {
                for (Map<String, Object> command : (List<Map<String, Object>>) yamlObject) {
                    String type = command.keySet().iterator().next();
                    Map<String, Object> args = (Map<String, Object>) command.get(type);
                    Command newCommand = CommandFactory.createCommand(type, args);
                    commands.add(newCommand);
                }
            }
        }
        catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + this.file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return commands;
    }


}

