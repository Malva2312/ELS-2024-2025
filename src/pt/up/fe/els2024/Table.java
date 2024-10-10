package pt.up.fe.els2024;

import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final List<String> columns; // Name of the columns
    private final ListOrderedMap<String, List<String>> rows; // Rows of the table
    private String name;

    public Table() {
        this.columns = new ArrayList<>();
        this.rows = new ListOrderedMap<>();
        this.name = "";
    }

    public Table(String name, List<String> columns) {
        this.columns = columns;
        this.rows = new ListOrderedMap<>();
        this.name = name;
    }

    public Table(Table table) {
        if (table == null) {
            throw new IllegalArgumentException("Table cannot be null");
        }

        this.columns = new ArrayList<>();
        this.columns.addAll(table.columns);

        this.rows = new ListOrderedMap<>();
        this.rows.putAll(table.rows);

        this.name = "";
    }

    public void renameTable(Table table, String newName){
        this.name = newName;
    }
    
    public static int getNumberOfRows(Table table) {
        return table.rows.size();
    }

    public static int getNumberOfColumns(Table table) {
        return table.columns.size();
    }

    public void addColumnDefault(String column){
        if (this.columns.contains(column)) {
            throw new IllegalArgumentException("Column already exists");
        }
        this.columns.add(column);

        for (String row : this.rows.keySet()) {
            this.rows.get(row).add("");
        }
    }

    public void addColumn(String column, List<String> values){
        if (this.columns.contains(column)) {
            throw new IllegalArgumentException("Column already exists");
        }
        this.columns.add(column);

        for (String row : this.rows.keySet()) {
            this.rows.get(row).add(values.get(this.columns.indexOf(column)));
        }
    }

    public void addRowDefault(String row){
        this.rows.put(row, new ArrayList<>());

        for (String column : this.columns) {
            this.rows.get(row).add("");
        }
    }

    public List<String> getColumns() {
        return columns;
    }

    public ListOrderedMap<String, List<String>> getRows() {
        return rows;
    }

    public void renameColumn(String oldName, String newName) {
        if (!this.columns.contains(oldName)) {
            throw new IllegalArgumentException("Column does not exist " + oldName);
        }
        if (this.columns.contains(newName)) {
            throw new IllegalArgumentException("Column already exists " + newName);
        }

        int index = this.columns.indexOf(oldName);
        this.columns.set(index, newName);

        for (List<String> row : this.rows.values()) {
            row.set(index, row.get(index));
        }
    }

    // Get column
    public List<String> getColumn(String column) {
        if (!this.columns.contains(column)) {
            throw new IllegalArgumentException("Column does not exist " + column);
        }

        List<String> columnValues = new ArrayList<>();
        int index = this.columns.indexOf(column);

        for (List<String> row : this.rows.values()) {
            columnValues.add(row.get(index));
        }

        return columnValues;
    }


    public List<String> getRow(String row) {
        if (!this.rows.containsKey(row)) {
            throw new IllegalArgumentException("Row does not exist " + row);
        }

        return this.rows.get(row);
    }
    public void removeColumn(String columnName){
        if (!this.columns.contains(columnName)) {
            throw new IllegalArgumentException("Column does not exist " + columnName);
        }

        int index = this.columns.indexOf(columnName);
        this.columns.remove(index);

        for (List<String> row : this.rows.values()) {
            row.remove(index);
        }
    }

    public void removeRow(String rowKey){
        if (!this.rows.containsKey(rowKey)) {
            throw new IllegalArgumentException("Row does not exist " + rowKey);
        }

        this.rows.remove(rowKey);
    }

    public void updateCell(String rowKey, String columnName, String newValue){
        if (!this.rows.containsKey(rowKey)) {
            throw new IllegalArgumentException("Row does not exist " + rowKey);
        }
        if (!this.columns.contains(columnName)) {
            throw new IllegalArgumentException("Column does not exist " + columnName);
        }

        int columnIndex = this.columns.indexOf(columnName);
        this.rows.get(rowKey).set(columnIndex, newValue);
    }
    public void clearTable(){
        this.columns.clear();
        this.rows.clear();
    }
    public void printTable(){
        System.out.println("Columns: " + this.columns);
        for (var entry : this.rows.entrySet()) {
            String rowKey = entry.getKey();
            List<String> rowValues = entry.getValue();
            System.out.println(rowKey + ": " + rowValues);
        }
    }

}
