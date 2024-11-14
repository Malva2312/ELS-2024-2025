package pt.up.fe.els2024.Builder;

import org.apache.commons.collections4.map.ListOrderedMap;
import pt.up.fe.els2024.Table.Table;

import java.util.Map;

public class DataBaseBuilder extends OperationBuilder {
    // Tables from the Table class
    private final ListOrderedMap<String, Table> tables;

    public DataBaseBuilder() {
        this.tables = new ListOrderedMap<>();
    }

    @Override
    protected OperationBuilder executeOperation() {
        return null;
    }

    public void addExtractedData(String targetName, Map<String, String> data) {
        Table table = new Table();
        for (var entry : data.entrySet()) {
            table.addColumn(entry.getKey(), entry.getValue().getClass(), entry.getValue(), false);
        }

        tables.put(targetName, table);
    }

    public void addTable(String name, Table table) {
        tables.put(name, table);
    }
}
