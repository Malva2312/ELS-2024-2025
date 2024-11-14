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

    public LoadXMLOperation(DataBaseBuilder builder) {
        super();
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

    @Override
    protected OperationBuilder executeOperation() {
        try {
            // Create an XmlMapper for parsing XML
            XmlMapper xmlMapper = new XmlMapper();
            List<Map<String, Object>> data = xmlMapper.readValue(new File(filePath), List.class);

            // Create a Table and add columns based on specified fields
            Table table = new Table();
            for (String field : fields) {
                table.addColumn(new Column(field, Object.class, null, true));
            }

            // Populate table rows with XML data
            for (Map<String, Object> entry : data) {
                Map<String, Object> rowValues = new HashMap<>();
                for (String field : fields) {
                    rowValues.put(field, entry.getOrDefault(field, null));
                }
                table.addRow(new Row(rowValues));
            }

            // Add table to DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return getBuilder();
    }
}
