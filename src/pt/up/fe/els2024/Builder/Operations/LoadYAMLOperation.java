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
        super();
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
        this.fields = List.of(fields);
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        try {
            // Create a Yaml instance to parse the file
            Yaml yaml = new Yaml();
            InputStream inputStream = new FileInputStream(filePath);
            Iterable<Object> yamlData = yaml.loadAll(inputStream);

            // Create a Table and add columns based on specified fields
            Table table = new Table();
            for (String field : fields) {
                table.addColumn(new Column(field, Object.class, null, true));
            }

            // Populate table rows with YAML data
            for (Object data : yamlData) {
                if (data instanceof Map) {
                    Map<String, Object> dataMap = (Map<String, Object>) data;
                    Map<String, Object> rowValues = new HashMap<>();
                    for (String field : fields) {
                        rowValues.put(field, dataMap.getOrDefault(field, null));
                    }
                    table.addRow(new Row(rowValues));
                }
            }

            // Add table to DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return getBuilder();
    }
}
