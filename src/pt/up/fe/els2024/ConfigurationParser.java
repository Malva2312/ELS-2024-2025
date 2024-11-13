package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Commands.Command;
import pt.up.fe.els2024.Commands.CommandFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The ConfigurationParser class is responsible for parsing configuration files and creating commands.
 */
public class ConfigurationParser {
    // The configuration file to be parsed
    private final File config;

    /**
     * Constructs a ConfigurationParser with the specified configuration file.
     *
     * @param file The configuration file to be parsed.
     */
    public ConfigurationParser(File file) {
        this.config = file;
    }

    /**
     * Constructs a ConfigurationParser with the specified file path.
     *
     * @param filePath The path to the configuration file to be parsed.
     */
    public ConfigurationParser(String filePath) {
        System.out.println("File path: " + filePath);
        this.config = new File(filePath);
    }

    /**
     * Parses the configuration file and creates a list of commands.
     *
     * @return A list of commands parsed from the configuration file.
     * @throws FileNotFoundException if the configuration file cannot be found.
     */
    public List<Command> parseCommands() throws FileNotFoundException {
        List<Command> commands = new ArrayList<>();
        Yaml yaml = new Yaml();

        try (InputStream inputStream = new FileInputStream(config)) {
            List<Map<String, Object>> data = yaml.load(inputStream);
            if (data == null) {
                return commands;
            }

            for (Map<String, Object> command : data) {
                String type = command.keySet().iterator().next();
                Map<String, Object> args = (Map<String, Object>) command.get(type);

                Command newCommand = CommandFactory.createCommand(type, args);
                commands.add(newCommand);
            }

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Could not find configuration: " + config);
        } catch (IOException e) {
            System.out.println("Error reading configuration file: " + e.getMessage());
        }

        return commands;
    }
}
