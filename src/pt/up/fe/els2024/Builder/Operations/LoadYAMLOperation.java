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
        this.fields = List.of(fields);
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        try (InputStream inputStream = new FileInputStream(filePath)) {
            Yaml yaml = new Yaml();
            Iterable<Object> yamlData = yaml.loadAll(inputStream);

            Table table = new Table();
            for (String field : fields) {
                table.addColumn(new Column(field, Object.class, null, true));
            }

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

            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            System.err.println("Error when loading YAML: " + e.getMessage());
        }

        return this;
    }
}
