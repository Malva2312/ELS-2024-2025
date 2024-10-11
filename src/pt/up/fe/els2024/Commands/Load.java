package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.*;

/**
 * The Load class implements the Command interface and is responsible for loading data from files into a table.
 */
public class Load implements Command {

    // The table to load data into
    private final Table table;
    // The list of files to load data from
    private final List<File> files;
    // The identifier for the load command
    private final String id;
    // The list of column names to be loaded
    private final List<String> columns;

    /**
     * Constructs a Load command with the specified parameters.
     *
     * @param id      The identifier for the load command.
     * @param table   The table to load data into.
     * @param files   The list of files to load data from.
     * @param columns The list of column names to be loaded.
     * @throws IllegalArgumentException if no source files are specified.
     */
    public Load(String id, Table table, List<File> files, List<String> columns) {
        this.id = id;
        this.table = table;
        this.columns = columns;

        this.files = new ArrayList<>(files);
        if (files.isEmpty()) {
            throw new IllegalArgumentException("Must specify at least one source file.");
        }
    }

    /**
     * Executes the Load command, loading data from the specified files into the table.
     *
     * @throws FileNotFoundException if any of the specified files cannot be found or read.
     */
    @Override
    public void execute() throws FileNotFoundException {
        // Map to store the data to be loaded into the table
        Map<String, List<String>> data = new HashMap<>();

        // Initialize YAML parser
        Yaml yaml = new Yaml();
        for (File file : this.files) {

            try (InputStream inputStream = new FileInputStream(file)) {
                // Load YAML content, expecting a list of maps
                Map<String, Object> cmds = yaml.load(inputStream);

                if (cmds == null) {
                    throw new IllegalArgumentException("Invalid YAML file: " + file.getName());
                }

                // Get parameters from YAML
                Map<String, String> columns = (Map<String, String>) cmds.get("params");

                for (Map.Entry<String, String> entry : columns.entrySet()) {
                    String key = entry.getKey();

                    // Get value and convert it to string if necessary
                    Object value = entry.getValue();

                    if (data.containsKey(key)) {
                        data.get(key).add(Objects.requireNonNullElse(value, "").toString());
                    } else {
                        List<String> values = new ArrayList<>();
                        values.add(Objects.requireNonNullElse(value, "").toString());
                        data.put(key, values);
                    }
                }

            } catch (IOException e) {
                throw new FileNotFoundException("Error reading file: " + file.getName());
            }
        }

        // Add data to the table
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            String key = entry.getKey();
            List<String> values = entry.getValue();

            if (this.table.getColumns().contains(key)) {
                throw new IllegalArgumentException("Column already exists: " + key);
            }

            this.table.addColumn(key, values);
            System.out.println("Added column '" + key + "'");
            System.out.println("Added values: " + values);
        }
    }
}