package pt.up.fe.els2024.Table;

import org.apache.commons.collections4.Predicate;

import java.util.*;


/**
 * Represents a table with columns and rows.
 * Provides methods to manipulate and query the table data.
 */
public class Table {

    /**
     * List of columns in the table.
     */
    private List<Column> columns;

    /**
     * List of rows in the table.
     */
    private List<Row> rows;

    /**
     * Constructs a new Table with the specified columns.
     * Initializes the rows as an empty list.
     *
     * @param columns the list of columns to initialize the table with
     */
    public Table(List<Column> columns){
        this.columns = new ArrayList<>(columns);
        this.rows = new ArrayList<>();
    }

    /**
     * Constructs a new Table with no columns and no rows.
     * Initializes the columns and rows as empty lists.
     */
    public Table(){
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    /**
     * Adds a new row to the table.
     *
     * @param row the row to be added
     */
    public void addRow(Row row){
        rows.add(row);
    }

    /**
     * Adds a new row to the table with the specified values.
     * Validates and sets default values for missing columns.
     *
     * @param values a map containing column names as keys and their corresponding values
     * @throws IllegalArgumentException if a value does not match the column type
     */
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

   /**
     * Updates the values of an existing row in the table.
     *
     * @param rowIndex the index of the row to be updated
     * @param updatedValues a map containing column names as keys and their new values
     * @throws IndexOutOfBoundsException if the row index is out of range
     * @throws IllegalArgumentException if a column does not exist or a value does not match the column type
     */
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

    /**
     * Deletes a row from the table at the specified index.
     *
     * @param rowIndex the index of the row to be deleted
     * @throws IndexOutOfBoundsException if the row index is out of range
     */
    public void deleteRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < rows.size()) {
            rows.remove(rowIndex);
        } else {
            throw new IndexOutOfBoundsException("Row index out of range: " + rowIndex);
        }
    }

    /**
     * Returns the list of rows in the table.
     *
     * @return the list of rows
     */
    public List<Row> getRows(){
        return rows;
    }

    /**
     * Retrieves a column by its name.
     *
     * @param columnName the name of the column to retrieve
     * @return the column with the specified name, or null if no such column exists
     */
    public Column getColumn(String columnName){
        for(Column column : columns){
            if(column.getName().equals(columnName)){
                return column;
            }
        }
        return null;
    }

    /**
     * Adds a new column to the table.
     *
     * @param column the column to be added
     */
    public void addColumn(Column column){
        columns.add(column);
    }

    /**
     * Adds a new column to the table with the specified properties.
     *
     * @param name the name of the new column
     * @param type the data type of the new column
     * @param defaultValue the default value for the new column
     * @param nullable whether the new column can contain null values
     * @throws IllegalArgumentException if a column with the specified name already exists
     */
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

    /**
     * Selects specific columns from the table and returns a new table containing only those columns.
     *
     * @param columnNames the list of column names to select
     * @return a new Table containing only the selected columns
     */
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

    /**
     * Renames a column in the table.
     *
     * @param oldName the current name of the column to be renamed
     * @param newName the new name for the column
     * @throws IllegalArgumentException if a column with the new name already exists
     * @throws NoSuchElementException if the column with the old name does not exist
     */
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

    /**
     * Validates the type of the given value against the specified column.
     * Ensures that the value matches the column's data type and nullability constraints.
     *
     * @param column the column to validate against
     * @param value the value to be validated
     * @throws IllegalArgumentException if the value does not match the column type or nullability constraints
     */
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

    /**
     * Filters the rows of the table based on the specified condition.
     *
     * @param condition the condition to evaluate each row against
     * @return a new Table containing only the rows that satisfy the condition
     */
    public Table filterRows(Predicate<Row> condition) {
        Table filteredTable = new Table(columns);
        for (Row row : rows) {
            if (condition.evaluate(row)) {
                filteredTable.addRow(row.getData());
            }
        }
        return filteredTable;
    }

    /**
     * Searches for rows in the table where the specified column has the given value.
     *
     * @param columnName the name of the column to search
     * @param value the value to search for in the specified column
     * @return a new Table containing the rows that match the search criteria
     */
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

    /**
     * Sorts the rows of the table based on the values in the specified column.
     *
     * @param columnName the name of the column to sort by
     * @param ascending  if true, sorts in ascending order; if false, sorts in descending order
     * @return a new Table with the rows sorted by the specified column
     * @throws IllegalArgumentException if the specified column does not exist
     */
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

    /**
     * Prints the table to the console.
     * Displays the column names followed by the rows of data.
     */
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

   /**
     * Returns the list of columns in the table.
     *
     * @return the list of columns
     */
   public List<Column> getColumns() {
       return columns;
   }

    /**
     * Calculates the mean of the values in the specified column.
     *
     * @param column the name of the column
     * @return the mean of the column values
     * @throws IllegalArgumentException if the column does not exist or is not numeric
     */
    public Double getColumnMean(String column) {
        Column col = getColumn(column);
        if (col == null) {
            throw new IllegalArgumentException("Column " + column + " does not exist.");
        }

        if (col.getType() != Integer.class && col.getType() != Double.class) {
            throw new IllegalArgumentException("Column " + column + " must be of type Integer or Double.");
        }

        double sum = 0;
        int count = 0;
        for (Row row : rows) {
            Object value = row.getValue(column);
            if (value != null) {
                sum += (double) value;
                count++;
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("Column " + column + " has no numeric values.");
        }

        return sum / count;
    }

    /**
     * Filters the rows of the table based on the specified condition for a column.
     *
     * @param column the name of the column to filter on
     * @param condition the condition to apply (e.g., "=", "!=", "<", "<=", ">", ">=")
     * @param value the value to compare against
     * @return a new Table containing only the rows that satisfy the condition
     * @throws IllegalArgumentException if the condition is invalid
     */
    public Table filter(String column, String condition, String value) {
        Predicate<Row> predicate = row -> {
            Object rowValue = row.getValue(column);
            if (rowValue == null) {
                return false;
            }

            switch (condition) {
                case "=":
                    return rowValue.equals(value);
                case "!=":
                    return !rowValue.equals(value);
                case "<":
                    return ((Comparable<Object>) rowValue).compareTo(value) < 0;
                case "<=":
                    return ((Comparable<Object>) rowValue).compareTo(value) <= 0;
                case ">":
                    return ((Comparable<Object>) rowValue).compareTo(value) > 0;
                case ">=":
                    return ((Comparable<Object>) rowValue).compareTo(value) >= 0;
                default:
                    throw new IllegalArgumentException("Invalid condition: " + condition);
            }
        };

        return filterRows(predicate);
    }

    /**
     * Concatenates the columns of this table with another table horizontally.
     * If the number of rows differs, null values are used to fill the gaps.
     *
     * @param table2 the table to concatenate with
     * @return a new Table with the columns of both tables concatenated
     */
    public Table concatHorizontal(Table table2) {
        List<Column> newColumns = new ArrayList<>(columns);
        newColumns.addAll(table2.getColumns());

        Table newTable = new Table(newColumns);
        int numRows = Math.max(rows.size(), table2.getRows().size());

        for (int i = 0; i < numRows; i++) {
            Map<String, Object> values = new HashMap<>();
            for (Column column : columns) {
                Object value = null;
                if (i < rows.size()) {
                    value = rows.get(i).getValue(column.getName());
                }
                values.put(column.getName(), value);
            }
            for (Column column : table2.getColumns()) {
                Object value = null;
                if (i < table2.getRows().size()) {
                    value = table2.getRows().get(i).getValue(column.getName());
                }
                values.put(column.getName(), value);
            }
            newTable.addRow(values);
        }

        return newTable;
    }

    /**
     * Concatenates the rows of this table with another table vertically.
     * Both tables must have the same columns.
     *
     * @param table2 the table to concatenate with
     * @return a new Table with the rows of both tables concatenated
     * @throws IllegalArgumentException if the tables do not have the same columns
     */
    public Table concatVertical(Table table2) {
        if (!columns.equals(table2.getColumns())) {
            throw new IllegalArgumentException("Tables must have the same columns to concatenate vertically.");
        }

        Table newTable = new Table(columns);
        newTable.getRows().addAll(rows);
        newTable.getRows().addAll(table2.getRows());
        return newTable;
    }

    /**
     * Returns the number of rows in the table.
     *
     * @return the number of rows
     */
    public Object getRowCount() {
        return rows.size();
    }

    /**
     * Limits the rows of the table to the specified range.
     *
     * @param from the starting index (inclusive)
     * @param to the ending index (exclusive)
     * @return the current Table after modification
     * @throws IllegalArgumentException if the range is invalid
     */
    public Table limit(int from, int to) {
        if (from < 0 || to > rows.size() || from > to) {
            throw new IllegalArgumentException("Invalid range: 'from' should be >= 0, 'to' should be <= number of rows, and 'from' should be <= 'to'.");
        }

        rows = rows.subList(from, to);
        return this;
    }

    /**
     * Inserts the rows of another table into this table.
     * The columns of the other table must exist in this table.
     *
     * @param newTable the table containing the rows to insert
     * @throws IllegalArgumentException if a column in the other table does not exist in this table
     */
    public void insert(Table newTable) {
        for (Column column : newTable.getColumns()) {
            if (getColumn(column.getName()) == null) {
                throw new IllegalArgumentException("Column " + column.getName() + " does not exist.");
            }
        }

        rows.addAll(newTable.getRows());
    }

    /**
     * Joins this table with another table based on the specified columns.
     * If the target columns are not specified, performs a Cartesian product.
     *
     * @param table2 the table to join with
     * @param targetColumn1 the column in this table to join on
     * @param targetColumn2 the column in the other table to join on
     * @return a new Table with the joined rows
     */
    public Table join(Table table2, String targetColumn1, String targetColumn2) {
        List<Column> newColumns = new ArrayList<>(columns);
        newColumns.addAll(table2.getColumns());
        Table newTable = new Table(newColumns);

        if (targetColumn1 != null && targetColumn2 != null) {
            for (Row row1 : rows) {
                for (Row row2 : table2.getRows()) {
                    if (row1.getValue(targetColumn1).equals(row2.getValue(targetColumn2))) {
                        Map<String, Object> values = new HashMap<>();
                        for (Column column : columns) {
                            values.put(column.getName(), row1.getValue(column.getName()));
                        }
                        for (Column column : table2.getColumns()) {
                            values.put(column.getName(), row2.getValue(column.getName()));
                        }
                        newTable.addRow(values);
                    }
                }
            }
        } else {
            for (Row row1 : rows) {
                for (Row row2 : table2.getRows()) {
                    Map<String, Object> values = new HashMap<>();
                    for (Column column : columns) {
                        values.put(column.getName(), row1.getValue(column.getName()));
                    }
                    for (Column column : table2.getColumns()) {
                        values.put(column.getName(), row2.getValue(column.getName()));
                    }
                    newTable.addRow(values);
                }
            }
        }

        return newTable;
    }
}