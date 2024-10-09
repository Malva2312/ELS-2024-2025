package pt.up.fe.els2024;

import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.List;

public class Table {

    private final String[] columns; // Name of the columns
    private final ListOrderedMap<String, List<String>> rows; // Rows of the table

    public Table() {
        this.columns = new String[0];
        this.rows = new ListOrderedMap<>();
    }

    public Table(String name, String[] columns) {
        this.columns = columns;
        this.rows = new ListOrderedMap<>();
    }

    public Table(Table table) {
        this.columns = new String[table.columns.length];
        System.arraycopy(table.columns, 0, this.columns, 0, table.columns.length);

        // Create a new ListOrderedMap and manually copy entries from the original table's rows
        this.rows = new ListOrderedMap<>();
        this.rows.putAll(table.rows);
    }
}
