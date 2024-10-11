package pt.up.fe.els2024;

import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Table {

    private final ListOrderedMap<String, List<String>> columns; // Rows of the table

    public Table() {
        this.columns = new ListOrderedMap<>();
    }

    public Table(String name, List<String> columns) {
        this.columns = new ListOrderedMap<>();
        this.columns.put(name, columns);
    }

    public Table(Table table) {
        if (table == null) {
            throw new IllegalArgumentException("Table cannot be null");
        }

        this.columns = new ListOrderedMap<>();
        this.columns.putAll(table.columns);
    }
    
    public static int getNumberOfRows(Table table) {
        return table.columns.getValue(0).size();
    }

    public static int getNumberOfColumns(Table table) {
        return table.columns.keySet().size();
    }

    public void addColumnDefault(String column){
        if (this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column already exists");
        }

        this.columns.put(column, new ArrayList<>());
        for (String row : this.columns.keySet()) {
            this.columns.get(row).add("");
        }
    }

    public void addColumn(String column, List<String> values){
        if (this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column already exists");
        }

        this.columns.put(column, values);
    }

    public void addColumn(String column, Map<String, String> values){
        if (this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column already exists");
        }

        List<String> columnValues = new ArrayList<>();
        for (String row : this.columns.keySet()) {
            columnValues.add(values.get(row));
        }

        this.columns.put(column, columnValues);

        // set empty values for rows that do not exist
        for (String row : values.keySet()) {
            if (!this.columns.containsKey(row)) {
                this.columns.get(column).add("");
            }
        }
    }

    public void addRowDefault(String row){
        if (this.columns.isEmpty()) {
            throw new IllegalArgumentException("Table has no columns");
        }

        for (String column : this.columns.keySet()) {
            this.columns.get(column).add("");
        }
    }

    public List<String> getColumns() {
        return new ArrayList<>(this.columns.keySet());
    }

    public List<String> getRowAt(int idx) {
        List<String> row = new ArrayList<>();
        for (String column : this.columns.keySet()) {
            row.add(this.columns.get(column).get(idx));
        }
        return row;
    }

    public void renameColumn(String oldName, String newName) {
        if (!this.columns.containsKey(oldName)) {
            throw new IllegalArgumentException("Column does not exist " + oldName);
        }

        if (this.columns.containsKey(newName)) {
            throw new IllegalArgumentException("Column already exists " + newName);
        }

        List<String> columnValues = this.columns.remove(oldName);
        this.columns.put(newName, columnValues);
    }

    // Get column
    public List<String> getColumn(String column) {
        if (!this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column does not exist " + column);
        }

        return this.columns.get(column);
    }

    public void removeColumn(String columnName){

        if (!this.columns.containsKey(columnName)) {
            throw new IllegalArgumentException("Column does not exist " + columnName);
        }

        this.columns.remove(columnName);
    }

    public void removeRowAt(int rowKey){
        for (String column : this.columns.keySet()) {
            this.columns.get(column).remove(rowKey);
        }
    }

    public void clearTable(){
        this.columns.clear();
    }

    public void addRow(List<String> row) {
        if (row.size() != this.columns.size()) {
            throw new IllegalArgumentException("Row size does not match table size");
        }

        int i = 0;
        for (String column : this.columns.keySet()) {
            this.columns.get(column).add(row.get(i));
            i++;
        }
    }

    public String getCell(int row, String column) {
        if (!this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column does not exist " + column);
        }
        return this.columns.get(column).get(row);
    }
}
