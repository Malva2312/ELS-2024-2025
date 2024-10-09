package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Commands.Command;
import pt.up.fe.els2024.Commands.Rename;
import java.io.*;
import java.util.*;

public class ConfigurationParser {
    private final File file;

    public ConfigurationParser(File file) {
        this.file = file;
    }

    public ConfigurationParser(String filePath) {
        this(new File(filePath));
    }

    public List<Command> parseCommands() throws FileNotFoundException {
        List<Command> commands = new ArrayList<>();
        Yaml yaml = new Yaml();

        try (InputStream inputStream = new FileInputStream(this.file)) {
            Map<String, Object> config = yaml.load(inputStream);
            Table table = new Table();

            // Process the 'load' section
            if (config.containsKey("load")) {
                List<Map<String, Object>> loads = (List<Map<String, Object>>) config.get("load");
                for (Map<String, Object> loadEntry : loads) {
                    processLoad(loadEntry, table);
                }
            }

            // Process the 'rename' section
            if (config.containsKey("rename")) {
                List<Map<String, Object>> renames = (List<Map<String, Object>>) config.get("rename");
                for (Map<String, Object> renameEntry : renames) {
                    Map<String, String> renameMap = (Map<String, String>) renameEntry.get("columns");
                    Rename renameCommand = new Rename(table, renameMap);
                    renameCommand.execute();
                }
            }

            // Save the table to CSV
            writeTableToCSV(table, config);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return commands;
    }

    private void processLoad(Map<String, Object> loadEntry, Table table) {
        // Process load entries and add data to the table
        if (loadEntry.containsKey("file")) {
            List<Map<String, String>> files = (List<Map<String, String>>) loadEntry.get("file");
            for (Map<String, String> fileEntry : files) {
                String filePath = fileEntry.get("path");
                String alias = fileEntry.get("as");

                // You can load data from the filePath into the table and associate it with 'alias'
                // For simplicity, let's add alias as a column for demonstration purposes
                table.addColumn(alias);

                // Example: Add some dummy data related to the alias
                table.addRow(alias, "SampleData1");
                table.addRow(alias, "SampleData2");
            }
        }
    }

    private void writeTableToCSV(Table table, Map<String, Object> config) {
        String filePath = "./output.csv";  // Default file path
        if (config.containsKey("save")) {
            Map<String, Object> saveConfig = (Map<String, Object>) config.get("save");
            filePath = (String) saveConfig.get("file");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Write the header (column names)
            writer.write(String.join(",", table.getColumns()));
            writer.newLine();

            // Write each row
            for (var entry : table.getRows().entrySet()) {
                String rowKey = entry.getKey();
                List<String> rowValues = entry.getValue();

                List<String> escapedValues = new ArrayList<>();
                for (String value : rowValues) {
                    escapedValues.add(escapeCSVValue(value));
                }

                writer.write(rowKey + "," + String.join(",", escapedValues));
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String escapeCSVValue(String value) {
        if (value.contains(",") || value.contains("\"")) {
            value = value.replace("\"", "\"\"");
            return "\"" + value + "\"";
        }
        return value;
    }
}
