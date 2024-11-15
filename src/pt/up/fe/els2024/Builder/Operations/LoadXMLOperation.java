package pt.up.fe.els2024.Builder.Operations;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadXMLOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    public LoadXMLOperation(DataBaseBuilder builder) {
        super(builder);
    }

    public LoadXMLOperation from(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public LoadXMLOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public LoadXMLOperation withAttributes(String... fields) {
        this.fields = List.of(fields);
        return this;
    }

    public LoadXMLOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        try {
            // Initialize XmlMapper
            XmlMapper xmlMapper = new XmlMapper();

            // Read and parse the XML file
            File file = new File(filePath);
            Map<String, Object> xmlData = xmlMapper.readValue(file, Map.class);

            // Navigate to the nested path provided
            Map<String, Object> currentNode = xmlData;
            for (String node : nested) {

                currentNode = (Map<String, Object>) currentNode.get(node);
                if (currentNode == null) {
                    throw new IllegalArgumentException("No <" + node + "> element found under the specified path.");
                }
            }

            Map<String, Object> resources = (Map<String, Object>) currentNode;

            // Create the table and add columns
            Table table = new Table();
            if (fields == null || fields.isEmpty()) {
                // Add all columns if no specific fields are provided
                for (String column : resources.keySet()) {
                    table.addColumn(new Column(column, Object.class, null, true));
                }
            } else {
                // Add only specified columns
                for (String field : fields) {
                    table.addColumn(new Column(field, Object.class, null, true));
                }
            }

            // Populate the table with row data
            Map<String, Object> rowValues = new HashMap<>();
            for (String field : table.getRows().isEmpty() ? resources.keySet() : fields) {
                rowValues.put(field, resources.getOrDefault(field, null));
            }
            table.addRow(new Row(rowValues));

            // Add table to DataBaseBuilder
            getBuilder().addTable(tableName, table);

            // Print imported data
            System.out.println("Table: " + tableName);
            table.printTable();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }


}
