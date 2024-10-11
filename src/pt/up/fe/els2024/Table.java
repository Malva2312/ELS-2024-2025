package pt.up.fe.els2024;

import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The Table class represents a table with rows and columns.
 */
public class Table {

    // Rows of the table
    private final ListOrderedMap<String, List<String>> columns;

    /**
     * Constructs an empty Table.
     */
    public Table() {
        this.columns = new ListOrderedMap<>();
    }

    /**
     * Constructs a Table with a single column.
     *
     * @param name The name of the column.
     * @param columns The list of values for the column.
     */
    public Table(String name, List<String> columns) {
        this.columns = new ListOrderedMap<>();
        this.columns.put(name, columns);
    }

    /**
     * Constructs a Table by copying another Table.
     *
     * @param table The table to copy.
     * @throws IllegalArgumentException if the provided table is null.
     */
    public Table(Table table) {
        if (table == null) {
            throw new IllegalArgumentException("Table cannot be null");
        }

        this.columns = new ListOrderedMap<>();
        this.columns.putAll(table.columns);
    }

    /**
     * Gets the number of rows in the table.
     *
     * @param table The table to get the number of rows from.
     * @return The number of rows in the table.
     */
    public static int getNumberOfRows(Table table) {
        return table.columns.getValue(0).size();
    }

    /**
     * Gets the number of columns in the table.
     *
     * @param table The table to get the number of columns from.
     * @return The number of columns in the table.
     */
    public static int getNumberOfColumns(Table table) {
        return table.columns.keySet().size();
    }

    /**
     * Adds a new column with default values.
     *
     * @param column The name of the column to add.
     * @throws IllegalArgumentException if the column already exists.
     */
    public void addColumnDefault(String column){
        if (this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column already exists");
        }

        this.columns.put(column, new ArrayList<>());
        for (String row : this.columns.keySet()) {
            this.columns.get(row).add("");
        }
    }

    /**
     * Adds a new column with specified values.
     *
     * @param column The name of the column to add.
     * @param values The list of values for the column.
     * @throws IllegalArgumentException if the column already exists.
     */
    public void addColumn(String column, List<String> values){
        if (this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column already exists");
        }

        this.columns.put(column, values);
    }

    /**
     * Adds a new column with specified values from a map.
     *
     * @param column The name of the column to add.
     * @param values The map of values for the column.
     * @throws IllegalArgumentException if the column already exists.
     */
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

    /**
     * Adds a new row with default values.
     *
     * @param row The name of the row to add.
     * @throws IllegalArgumentException if the table has no columns.
     */
    public void addRowDefault(String row){
        if (this.columns.isEmpty()) {
            throw new IllegalArgumentException("Table has no columns");
        }

        for (String column : this.columns.keySet()) {
            this.columns.get(column).add("");
        }
    }

    /**
     * Gets the list of column names.
     *
     * @return The list of column names.
     */
    public List<String> getColumns() {
        return new ArrayList<>(this.columns.keySet());
    }

    /**
     * Gets the values of a row at a specified index.
     *
     * @param idx The index of the row.
     * @return The list of values in the row.
     */
    public List<String> getRowAt(int idx) {
        List<String> row = new ArrayList<>();
        for (String column : this.columns.keySet()) {
            row.add(this.columns.get(column).get(idx));
        }
        return row;
    }

    /**
     * Renames a column.
     *
     * @param oldName The current name of the column.
     * @param newName The new name of the column.
     * @throws IllegalArgumentException if the old column does not exist or the new column already exists.
     */
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

    /**
     * Gets the values of a column.
     *
     * @param column The name of the column.
     * @return The list of values in the column.
     * @throws IllegalArgumentException if the column does not exist.
     */
    public List<String> getColumn(String column) {
        if (!this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column does not exist " + column);
        }

        return this.columns.get(column);
    }

    /**
     * Removes a column.
     *
     * @param columnName The name of the column to remove.
     * @throws IllegalArgumentException if the column does not exist.
     */
    public void removeColumn(String columnName){
        if (!this.columns.containsKey(columnName)) {
            throw new IllegalArgumentException("Column does not exist " + columnName);
        }

        this.columns.remove(columnName);
    }

    /**
     * Removes a row at a specified index.
     *
     * @param rowKey The index of the row to remove.
     */
    public void removeRowAt(int rowKey){
        for (String column : this.columns.keySet()) {
            this.columns.get(column).remove(rowKey);
        }
    }

    /**
     * Clears all columns and rows in the table.
     */
    public void clearTable(){
        this.columns.clear();
    }

    /**
     * Adds a new row with specified values.
     *
     * @param row The list of values for the row.
     * @throws IllegalArgumentException if the row size does not match the table size.
     */
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

    /**
     * Gets the value of a cell.
     *
     * @param row The index of the row.
     * @param column The name of the column.
     * @return The value of the cell.
     * @throws IllegalArgumentException if the column does not exist.
     */
    public String getCell(int row, String column) {
        if (!this.columns.containsKey(column)) {
            throw new IllegalArgumentException("Column does not exist " + column);
        }
        return this.columns.get(column).get(row);
    }
}