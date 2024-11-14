package pt.up.fe.els2024.Builder.Operations;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import java.util.List;

public class LoadJSONOperation extends OperationBuilder {
    @Override
    protected OperationBuilder executeOperation() {
        try {
            // Create an ObjectMapper for parsing JSON
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File(filePath));

            // Create a Table and add columns based on specified fields
            Table table = new Table();
            for (String field : fields) {
                table.addColumn(new Column(field, Object.class, null, true));
            }

            // Iterate through JSON objects and add rows to the table
            for (JsonNode node : root) {
                Map<String, Object> rowValues = new HashMap<>();
                for (String field : fields) {
                    JsonNode fieldNode = node.get(field);
                    rowValues.put(field, fieldNode != null ? fieldNode.asText() : null);
                }
                table.addRow(new Row(rowValues));
            }

            // Optionally, add the table to a storage or database in DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return getBuilder();
    }

    public LoadJSONOperation(DataBaseBuilder builder) {
        super();
    }

    protected String filePath;
    protected String tableName;
    protected List<String> fields;

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
