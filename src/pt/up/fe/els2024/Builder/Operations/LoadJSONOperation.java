package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadJSONOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;

    public LoadJSONOperation(DataBaseBuilder builder) {
        super(builder);
    }

    @Override
    protected OperationBuilder executeOperation() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File(filePath));

            Table table = new Table();
            for (String field : fields) {
                table.addColumn(new Column(field, Object.class, null, true));
            }

            // Assume 'root' is the root JsonNode parsed from the JSON file
            JsonNode functionsArray = root.get("functions");
            if (functionsArray != null && functionsArray.isArray()) {
                for (JsonNode node : functionsArray) {
                    Map<String, Object> rowValues = new HashMap<>();
                    for (String field : fields) {
                        JsonNode fieldNode = node.get(field);
                        rowValues.put(field, fieldNode != null ? fieldNode.asText() : null);
                    }
                    table.addRow(new Row(rowValues));
                }
            }

            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            System.err.println("Error when loading JSON: " + e.getMessage());
        }

        return this;
    }

    public LoadJSONOperation from(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public LoadJSONOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public LoadJSONOperation withAttributes(String... fields) {
        this.fields = List.of(fields);
        return this;
    }
}
