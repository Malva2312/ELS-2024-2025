package pt.up.fe.els2024;

import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<String> columns; // Name of the columns
    private final ListOrderedMap<String, List<String>> rows; // Rows of the table

    public Table() {
        this.columns = new ArrayList();;
        this.rows = new ListOrderedMap<>();
    }

    public Table(String name, List<String> columns) {
        this.columns = columns;
        this.rows = new ListOrderedMap<>();
    }

    public Table(Table table) {
        this.columns = List.of();
        System.arraycopy(table.columns, 0, this.columns, 0, table.columns.size());

        // Create a new ListOrderedMap and manually copy entries from the original table's rows
        this.rows = new ListOrderedMap<>();
        this.rows.putAll(table.rows);
    }

    public void addColumn(String column){
        this.columns.add(column);
    }

    public void addRow(String row){
        this.rows.put(row, new ArrayList<>());
    }

    public List<String> getColumns() {
        return columns;
    }

    public ListOrderedMap<String, List<String>> getRows() {
        return rows;
    }
}
