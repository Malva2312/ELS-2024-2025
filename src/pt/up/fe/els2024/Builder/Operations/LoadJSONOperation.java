package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class responsible for loading JSON data into a table.
 */
public class LoadJSONOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    /**
     * Constructor for LoadJSONOperation.
     *
     * @param builder the DataBaseBuilder instance
     */
    public LoadJSONOperation(DataBaseBuilder builder) {
        super(builder);
    }

    /**
     * Executes the operation to load JSON data into a table.
     *
     * @return the current instance of LoadJSONOperation
     */
    @Override
    protected OperationBuilder executeOperation() {
        try {
            List<File> filesToProcess = new ArrayList<>();

            File file = new File(filePath);
            if (file.isDirectory()) {
                // Adds all JSON files from the directory
                File[] jsonFiles = file.listFiles(f -> f.isFile() && f.getName().endsWith(".json"));
                if (jsonFiles != null) {
                    filesToProcess.addAll(List.of(jsonFiles));
                }
            } else if (file.isFile() && file.getName().endsWith(".json")) {
                // Adds only the specified file
                filesToProcess.add(file);
            }

            // Initializes the table
            Table table = new Table();
            for (String field : fields) {
                table.addColumn(new Column(field, Object.class, null, true));
            }

            // Processes all found files
            for (File jsonFile : filesToProcess) {

                ObjectMapper mapper = new ObjectMapper();
                JsonNode root = mapper.readTree(jsonFile);

                if (nested != null) {
                    for (String nestedField : nested) {
                        root = root.get(nestedField);
                    }
                }

                if (root != null && root.isArray()) {

                    for (JsonNode node : root) {
                        Map<String, Object> rowValues = new HashMap<>();

                        for (String field : fields) {
                            JsonNode fieldNode = node.get(field);
                            rowValues.put(field, fieldNode != null ? fieldNode.asText() : null);
                        }

                        table.addRow(new Row(rowValues));
                    }
                }
            }

            // Adds the table to the DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            System.err.println("Error when loading JSON: " + e.getMessage());
        }

        return this;
    }

    /**
     * Sets the file path for the JSON file or directory.
     *
     * @param filePath the path to the JSON file or directory
     * @return the current instance of LoadJSONOperation
     */
    public LoadJSONOperation from(String filePath) {
        this.filePath = db.resolvePath(filePath);
        return this;
    }

    /**
     * Sets the table name where the JSON data will be loaded.
     *
     * @param tableName the name of the table
     * @return the current instance of LoadJSONOperation
     */
    public LoadJSONOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Sets the fields to be extracted from the JSON data.
     *
     * @param fields the fields to be extracted
     * @return the current instance of LoadJSONOperation
     */
    public LoadJSONOperation withAttributes(String... fields) {
        this.fields = List.of(fields);
        return this;
    }

    /**
     * Sets the nested fields to be extracted from the JSON data.
     *
     * @param nested the nested fields to be extracted
     * @return the current instance of LoadJSONOperation
     */
    public LoadJSONOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }
}
