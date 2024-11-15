package pt.up.fe.els2024.Builder;

import pt.up.fe.els2024.Builder.Operations.LoadJSONOperation;
import pt.up.fe.els2024.Builder.Operations.LoadXMLOperation;
import pt.up.fe.els2024.Builder.Operations.LoadYAMLOperation;
import pt.up.fe.els2024.Table.Table;

import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.Map;

public class DataBaseBuilder {

    private final ListOrderedMap<String, Table> tables;

    public DataBaseBuilder() {
        this.tables = new ListOrderedMap<>();
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

    public Table getTable(String name) {
        return tables.get(name);
    }

    public LoadJSONOperation loadJSON() {
        return new LoadJSONOperation(this);
    }

    public LoadXMLOperation loadXML() {
        return new LoadXMLOperation(this);
    }

    public LoadYAMLOperation loadYAML() {
        return new LoadYAMLOperation(this);
    }
}
