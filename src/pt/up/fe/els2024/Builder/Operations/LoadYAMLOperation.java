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

                // Extract from "params" object if it exists
                if (key.equals("params") && value instanceof Map) {
                    Map<String, Object> paramsMap = (Map<String, Object>) value;
                    for (Map.Entry<String, Object> paramEntry : paramsMap.entrySet()) {
                        String paramKey = paramEntry.getKey();
                        Object paramValue = paramEntry.getValue();

                        if (fields == null || fields.contains(paramKey)) {
                            table.addColumn(new Column(paramKey, Object.class, null, true));
                            rowValues.put(paramKey, paramValue);
                        }
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
