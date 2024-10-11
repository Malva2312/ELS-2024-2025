package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.*;

public class Load implements Command {

    private final Table table;
    private final List<File> files;
    private final String id;
    private final List<String> columns;
    //private final Map<String, Data>

    public Load(String id, Table table, List<File> files, List<String> columns) {
        this.id = id;
        this.table = table;
        this.columns = columns;

        this.files = new ArrayList<>(files);
        if (files.isEmpty()) {
            throw new IllegalArgumentException("Must specify at least one source file.");
        }
    }

    @Override
    public void execute() throws FileNotFoundException {
        Map<String, List<String>> data = new HashMap<>();

        Yaml yaml = new Yaml();
        for (File file : this.files) {

            try (InputStream inputStream = new FileInputStream(file)) {
                // Expecting a list of maps
                Map<String, Object> cmds = yaml.load(inputStream);

                if (cmds == null) {
                    throw new IllegalArgumentException("Invalid YAML file: " + file.getName());
                }

                // get params from yaml
                Map<String, String> columns = (Map<String, String>) cmds.get("params");


                for (Map.Entry<String, String> entry : columns.entrySet()) {
                    String key = entry.getKey();

                    // Get value and depending on the type, convert it to string
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

        // Add data to table
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