package pt.up.fe.els2024.Builder.Operations;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadYAMLOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    public LoadYAMLOperation(DataBaseBuilder builder) {
        super(builder);
    }

    public LoadYAMLOperation from(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public LoadYAMLOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public LoadYAMLOperation withAttributes(String... fields) {
        this.fields = fields.length > 0 ? List.of(fields) : null; // Add all columns if none are provided
        return this;
    }

    public LoadYAMLOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            Yaml yaml = new Yaml();
            Map<String, Object> yamlData = yaml.load(inputStream);

            Table table = new Table();
            Map<String, Object> rowValues = new HashMap<>();

            // Extract root-level key-value pairs with non-composite types
            for (Map.Entry<String, Object> entry : yamlData.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (isNonComposite(value)) {
                    if (fields == null || fields.contains(key)) {
                        table.addColumn(new Column(key, Object.class, null, true));
                        rowValues.put(key, value);
                    }
                }
            }

            // Navigate nested paths specified in the "nested" list
            if (nested != null && !nested.isEmpty()) {
                Map<String, Object> currentLevel = yamlData;
                for (int i = 0; i < nested.size(); i++) {
                    String currentKey = nested.get(i);
                    Object nestedValue = currentLevel.get(currentKey);

                    if (nestedValue instanceof Map && i < nested.size() - 1) {
                        currentLevel = (Map<String, Object>) nestedValue; // Descend further
                    } else if (i == nested.size() - 1 && nestedValue instanceof Map) {
                        // Extract key-value pairs at the final level
                        Map<String, Object> finalLevel = (Map<String, Object>) nestedValue;
                        for (Map.Entry<String, Object> nestedEntry : finalLevel.entrySet()) {
                            String nestedKey = nestedEntry.getKey();
                            Object nestedValueEntry = nestedEntry.getValue();

                            if (isNonComposite(nestedValueEntry) &&
                                    (fields == null || fields.contains(nestedKey))) {
                                table.addColumn(new Column(nestedKey, Object.class, null, true));
                                rowValues.put(nestedKey, nestedValueEntry);
                            }
                        }
                    } else {
                        break; // Invalid path or non-map value encountered
                    }
                }
            }


            // Add a single row to the table
            table.addRow(new Row(rowValues));
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            System.err.println("Error when loading YAML: " + e.getMessage());
        }

        System.out.println("Table: " + tableName);
        getBuilder().getTable(tableName).printTable();

        return this;
    }

    // Helper method to check for non-composite types
    private boolean isNonComposite(Object value) {
        return value == null || value instanceof String || value instanceof Number || value instanceof Boolean;
    }
}
