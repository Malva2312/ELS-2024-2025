package pt.up.fe.els2024.Builder;
import pt.up.fe.els2024.Table.Table;

import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.Map;

public class DataBaseBuilder extends OperationBuilder {

    private final ListOrderedMap<String, Table> tables;

    public DataBaseBuilder() {
        super(null);
        this.tables = new ListOrderedMap<>();
    }

    @Override
    protected DataBaseBuilder getBuilder() {
        return this;
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

    public ListOrderedMap<String, Table> getTables() {
        return tables;
    }


    public void dropTable(String tableName) {
        tables.remove(tableName);
    }

    @Override
    protected OperationBuilder executeOperation() {
        return null;
    }

    private String currentFolder = "";

    public void setCurrentFolder(String folder) {
        this.currentFolder = folder;
    }

    public String resolvePath(String fileName) {
        return currentFolder + "/" + fileName;
    }
}
