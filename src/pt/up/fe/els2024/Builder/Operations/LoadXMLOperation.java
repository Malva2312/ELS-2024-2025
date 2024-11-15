package pt.up.fe.els2024.Builder.Operations;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * LoadXMLOperation is responsible for loading XML data into a table.
 */
public class LoadXMLOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    /**
     * Constructor for LoadXMLOperation.
     *
     * @param builder the DataBaseBuilder instance
     */
    public LoadXMLOperation(DataBaseBuilder builder) {
        super(builder);
    }

    /**
     * Sets the file path for the XML file or directory.
     *
     * @param filePath the path to the XML file or directory
     * @return the current LoadXMLOperation instance
     */
    public LoadXMLOperation from(String filePath) {
        this.filePath = db.resolvePath(filePath);
        return this;
    }

    /**
     * Sets the table name where the XML data will be loaded.
     *
     * @param tableName the name of the table
     * @return the current LoadXMLOperation instance
     */
    public LoadXMLOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Specifies the attributes (fields) to be loaded from the XML.
     *
     * @param fields the attributes to be loaded
     * @return the current LoadXMLOperation instance
     */
    public LoadXMLOperation withAttributes(String... fields) {
        this.fields = List.of(fields);
        return this;
    }

    /**
     * Specifies the nested elements to be processed within the XML.
     *
     * @param nested the nested elements
     * @return the current LoadXMLOperation instance
     */
    public LoadXMLOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }

    /**
     * Executes the operation to load XML data into the table.
     *
     * @return the current LoadXMLOperation instance
     */
    @Override
    protected OperationBuilder executeOperation() {
        try {
            List<File> filesToProcess = new ArrayList<>();
            File file = new File(filePath);

            if (file.isDirectory()) {
                // Add all XML files from the directory
                File[] xmlFiles = file.listFiles(f -> f.isFile() && f.getName().endsWith(".xml"));
                if (xmlFiles != null) {
                    filesToProcess.addAll(List.of(xmlFiles));
                }
            } else if (file.isFile() && file.getName().endsWith(".xml")) {
                // Add only the specified file
                filesToProcess.add(file);
            }

            // Initialize the combined table
            Table table = new Table();

            XmlMapper xmlMapper = new XmlMapper();

            // Process all XML files
            for (File xmlFile : filesToProcess) {
                Map<String, Object> xmlData = xmlMapper.readValue(xmlFile, Map.class);

                Map<String, Object> currentNode = xmlData;
                if (nested != null) {
                    for (String node : nested) {
                        currentNode = (Map<String, Object>) currentNode.get(node);
                        if (currentNode == null) {
                            throw new IllegalArgumentException("No <" + node + "> element found in file: " + xmlFile.getName());
                        }
                    }
                }

                Map<String, Object> resources = currentNode;

                // If `fields` is null, initialize with all available keys
                if (fields == null) {
                    fields = new ArrayList<>(resources.keySet());
                }

                // Add columns to the table, checking if they already exist
                for (String field : fields) {
                    if (table.getColumn(field) == null) { // Check if the column already exists
                        table.addColumn(new Column(field, Object.class, null, true));
                    }
                }

                // Fill the table rows
                Map<String, Object> rowValues = new HashMap<>();
                for (String field : fields) {
                    rowValues.put(field, resources.getOrDefault(field, null));
                }
                table.addRow(new Row(rowValues));
            }

            // Add the combined table to the DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }
}
