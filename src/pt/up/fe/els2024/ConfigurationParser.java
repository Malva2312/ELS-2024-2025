package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Commands.Command;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
        try (InputStream inputStream = new FileInputStream(this.file)){
            //TODO

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return commands;
    }
}

