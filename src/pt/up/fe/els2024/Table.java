package pt.up.fe.els2024;

import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<String> columns; // Name of the columns
    private final ListOrderedMap<String, List<String>> rows; // Rows of the table

    public Table() {
        this.columns = new ArrayList<>();
        this.rows = new ListOrderedMap<>();
    }

    public void addColumn(String column) {
        if (!this.columns.contains(column)) {
            this.columns.add(column);
        }
    }

    public void addRow(String key, String value) {
        if (!this.rows.containsKey(key)) {
            this.rows.put(key, new ArrayList<>());
        }
        this.rows.get(key).add(value);
    }

    public List<String> getColumns() {
        return columns;
    }

    public ListOrderedMap<String, List<String>> getRows() {
        return rows;
    }
}
