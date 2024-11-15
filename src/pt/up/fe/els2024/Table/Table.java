package pt.up.fe.els2024.Table;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.*;

/**
 * The Table class represents a table with rows and columns.
 */
public class Table {

    private List<Column> columns;
    private List<Row> rows;

    public Table(List<Column> columns){
        this.columns = new ArrayList<>(columns);
        this.rows = new ArrayList<>();
    }

    public Table(){
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    public void addRow(Row row){
        rows.add(row);
    }


    public void addRow(Map<String, Object> values) {
        // Validate and set default values for missing columns
        for (Column column : columns) {
            if (!values.containsKey(column.getName())) {
                values.put(column.getName(), column.getDefaultValue());
            } else {
                Object value = values.get(column.getName());
                validateColumnType(column, value);
            }
        }
        Row row = new Row(values);
        rows.add(row);
    }

    public void updateRow(int rowIndex, Map<String, Object> updatedValues) {
        if (rowIndex >= 0 && rowIndex < rows.size()) {
            Row row = rows.get(rowIndex);
            for (Map.Entry<String, Object> entry : updatedValues.entrySet()) {
                Column column = getColumn(entry.getKey());
                if (column != null) {
                    validateColumnType(column, entry.getValue());
                    row.setValue(entry.getKey(), entry.getValue());
                } else {
                    throw new IllegalArgumentException("Column " + entry.getKey() + " does not exist.");
                }
            }
        } else {
            throw new IndexOutOfBoundsException("Row index out of range: " + rowIndex);
        }
    }

    public void deleteRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < rows.size()) {
            rows.remove(rowIndex);
        } else {
            throw new IndexOutOfBoundsException("Row index out of range: " + rowIndex);
        }
    }

    public List<Row> getRows(){
        return rows;
    }

    public Column getColumn(String columnName){
        for(Column column : columns){
            if(column.getName().equals(columnName)){
                return column;
            }
        }
        return null;
    }

    public void addColumn(Column column){
        columns.add(column);
    }

    public void addColumn(String name, Class<?> type, Object defaultValue, boolean nullable) {
        if (getColumn(name) != null) {
            throw new IllegalArgumentException("Column " + name + " already exists.");
        }

        Column column = new Column(name, type, defaultValue, nullable);
        columns.add(column);

        // Add the new column to each row with the default value
        for (Row row : rows) {
            row.setValue(name, defaultValue);
        }
    }

    public Table selectColumns(List<String> columnNames){
        List<Column> selectedColumns = new ArrayList<>();
        for (String name : columnNames){
            Column column = getColumn(name);
            if (column != null){
                selectedColumns.add(column);
            }
        }

        Table newTable = new Table(selectedColumns);
        for (Row row : rows){
            Map<String, Object> values = new HashMap<>();
            for (String name : columnNames){
                values.put(name, row.getValue(name));
            }
            newTable.addRow(values);
        }
        return newTable;
    }

    public void renameColumn(String oldName, String newName) {
        Column column = getColumn(oldName);
        if (column != null) {
            if (getColumn(newName) != null) {
                throw new IllegalArgumentException("Column " + newName + " already exists.");
            }

            column.setName(newName);

            // Update column names in all rows
            for (Row row : rows) {
                Object value = row.getValue(oldName);
                row.setValue(newName, value);
                row.getData().remove(oldName);
            }
        } else {
            throw new NoSuchElementException("Column " + oldName + " not found.");
        }
    }

    private void validateColumnType(Column column, Object value) {
        if (value != null && !column.getType().isInstance(value)) {
            throw new IllegalArgumentException("Invalid type for column " + column.getName() +
                    ". Expected " + column.getType().getSimpleName() +
                    " but got " + value.getClass().getSimpleName());
        }

        if (value == null && !column.isNullable()) {
            throw new IllegalArgumentException("Column " + column.getName() + " cannot be null.");
        }
    }

    public Table filterRows(Predicate<Row> condition) {
        Table filteredTable = new Table(columns);
        for (Row row : rows) {
            if (condition.evaluate(row)) {
                filteredTable.addRow(row.getData());
            }
        }
        return filteredTable;
    }

    public Table searchRows(String columnName, Object value) {
        Table searchResult = new Table(columns);
        for (Row row : rows) {
            Object columnValue = row.getValue(columnName);
            if (columnValue != null && columnValue.equals(value)) {
                searchResult.addRow(row.getData());
            }
        }
        return searchResult;
    }

    public Table sortRows(String columnName, boolean ascending) {
        List<Row> sortedRows = new ArrayList<>(rows);
        Column column = getColumn(columnName);

        if (column == null) {
            throw new IllegalArgumentException("Column " + columnName + " does not exist.");
        }

        Comparator<Row> comparator = (row1, row2) -> {
            Comparable<Object> value1 = (Comparable<Object>) row1.getValue(columnName);
            Comparable<Object> value2 = (Comparable<Object>) row2.getValue(columnName);
            return value1.compareTo(value2);
        };

        if (!ascending) {
            comparator = comparator.reversed();  // Reverse for descending order
        }

        sortedRows.sort(comparator);

        Table sortedTable = new Table(columns);
        for (Row row : sortedRows) {
            sortedTable.addRow(row.getData());
        }
        return sortedTable;
    }

    public void printTable() {
        // Print column names
        for (Column column : columns) {
            System.out.print(column.getName() + "\t");
        }
        System.out.println();

        // Print rows
        for (Row row : rows) {
            for (Column column : columns) {
                System.out.print(row.getValue(column.getName()) + "\t");
            }
            System.out.println();
        }
    }


}