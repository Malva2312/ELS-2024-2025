package pt.up.fe.els2024.Builder.Operations;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class responsible for loading YAML files and converting them into table rows.
 */
public class LoadYAMLOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    /**
     * Constructor for LoadYAMLOperation.
     *
     * @param builder the DataBaseBuilder instance
     */
    public LoadYAMLOperation(DataBaseBuilder builder) {
        super(builder);
    }

    /**
     * Sets the file path for the YAML file to be loaded.
     *
     * @param filePath the path to the YAML file
     * @return the current LoadYAMLOperation instance
     */
    public LoadYAMLOperation from(String filePath) {
        this.filePath = db.resolvePath(filePath);
        return this;
    }

    /**
     * Sets the table name where the data will be loaded.
     *
     * @param tableName the name of the table
     * @return the current LoadYAMLOperation instance
     */
    public LoadYAMLOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Specifies the attributes (fields) to be loaded from the YAML file.
     *
     * @param fields the attributes to be loaded
     * @return the current LoadYAMLOperation instance
     */
    public LoadYAMLOperation withAttributes(String... fields) {
        this.fields = fields.length > 0 ? List.of(fields) : null; // Add all columns if none are provided
        return this;
    }

    /**
     * Specifies the nested paths to be navigated in the YAML file.
     *
     * @param nested the nested paths
     * @return the current LoadYAMLOperation instance
     */
    public LoadYAMLOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }

    /**
     * Executes the operation to load the YAML file and convert it into table rows.
     *
     * @return the current LoadYAMLOperation instance
     */
    @Override
    protected OperationBuilder executeOperation() {
        try {
            List<File> filesToProcess = new ArrayList<>();
            File file = new File(filePath);

            if (file.isDirectory()) {
                // Add all YAML files from the directory
                File[] yamlFiles = file.listFiles(f -> f.isFile() && f.getName().endsWith(".yaml"));
                if (yamlFiles != null) {
                    filesToProcess.addAll(List.of(yamlFiles));
                }
            } else if (file.isFile() && file.getName().endsWith(".yaml")) {
                // Add only the specified file
                filesToProcess.add(file);
            }

            // Initialize the combined table
            Table table = new Table();

            Yaml yaml = new Yaml();

            for (File yamlFile : filesToProcess) {

                try (InputStream inputStream = new FileInputStream(yamlFile)) {
                    Map<String, Object> yamlData = yaml.load(inputStream);

                    Map<String, Object> rowValues = new HashMap<>();

                    // Extract root-level key-value pairs with non-composite types
                    for (Map.Entry<String, Object> entry : yamlData.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();

                        if (isNonComposite(value)) {
                            if (fields == null || fields.contains(key)) {
                                if (table.getColumn(key) == null) {
                                    table.addColumn(new Column(key, Object.class, null, true));
                                }
                                rowValues.put(key, value);
                            }
                        }
                    }

                    // Navigate nested paths, if specified
                    if (nested != null && !nested.isEmpty()) {
                        Map<String, Object> currentLevel = yamlData;
                        for (int i = 0; i < nested.size(); i++) {
                            String currentKey = nested.get(i);
                            Object nestedValue = currentLevel.get(currentKey);

                            if (nestedValue instanceof Map && i < nested.size() - 1) {
                                currentLevel = (Map<String, Object>) nestedValue; // Go one level deeper
                            } else if (i == nested.size() - 1 && nestedValue instanceof Map) {
                                // Extract key-value pairs at the final level
                                Map<String, Object> finalLevel = (Map<String, Object>) nestedValue;
                                for (Map.Entry<String, Object> nestedEntry : finalLevel.entrySet()) {
                                    String nestedKey = nestedEntry.getKey();
                                    Object nestedValueEntry = nestedEntry.getValue();

                                    if (isNonComposite(nestedValueEntry) &&
                                            (fields == null || fields.contains(nestedKey))) {
                                        if (table.getColumn(nestedKey) == null) {
                                            table.addColumn(new Column(nestedKey, Object.class, null, true));
                                        }
                                        rowValues.put(nestedKey, nestedValueEntry);
                                    }
                                }
                            } else {
                                break; // Invalid path or non-mappable value found
                            }
                        }
                    }

                    // Add a row for each processed YAML file
                    table.addRow(new Row(rowValues));
                }
            }

            // Add the combined table to the DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            System.err.println("Error when loading YAML: " + e.getMessage());
        }

        return this;
    }

    /**
     * Helper method to check for non-composite types.
     *
     * @param value the value to check
     * @return true if the value is non-composite, false otherwise
     */
    private boolean isNonComposite(Object value) {
        return value == null || value instanceof String || value instanceof Number || value instanceof Boolean;
    }
}
