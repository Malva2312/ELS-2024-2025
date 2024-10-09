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
            // Expecting a list of maps
            Map<String, Object> cmds = yaml.load(inputStream);
            Table table = new Table();
            //= cmds.keySet().toString();
            System.out.printf("KEYSET -> " + cmds.keySet().toString());
            List<String> row = new ArrayList<>();

            // Iterate over the list
            for (var command : cmds.entrySet()) {
                // Get yaml keys
                String key = command.getKey().toString();
                //System.out.printf("\nKEY -> " + key);
                table.addColumn(key);
                // Get corresponding values
                table.addRow(command.getValue().toString());

                /*for (var value : command.getValue().toString().split(",")) {
                    //String value = command.getValue().toString();
                    System.out.printf("\nVALUE -> " + command.getValue().toString());
                    table.addRow(value);
                }*/
            }
            //System.out.printf("COLUMNS -> \n" + table.getColumns().toString());
            //System.out.printf("\nROWS -> " + table.getRows().toString() + "\n");

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("./assignment1Files/configurationFile.csv"))) {
                // Write the header (column names)
                writer.write(String.join(",", table.getColumns()));
                writer.newLine();

                // Write each row
                for (var entry : table.getRows().entrySet()) {
                    String rowKey = entry.getKey();
                    List<String> rowValues = entry.getValue();
                    writer.write(rowKey + "," + String.join(",", rowValues));
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return commands;
    }


}

