package pt.up.fe.els2024.Table;

import java.util.Map;

/**
 * Represents a row in a table with column data.
 */
public class Row {
    private Map<String, Object> data;

    /**
     * Constructs a Row with the specified data.
     *
     * @param values the data for the row, where the key is the column name and the value is the column value
     */
    public Row(Map<String, Object> values) {
        this.data = values;
    }

    /**
     * Retrieves the value for the specified column.
     *
     * @param columnName the name of the column
     * @return the value of the specified column, or null if the column does not exist
     */
    public Object getValue(String columnName) {
        return data.get(columnName);
    }

    /**
     * Sets the value for the specified column.
     *
     * @param columnName the name of the column
     * @param value the value to set for the specified column
     */
    public void setValue(String columnName, Object value) {
        data.put(columnName, value);
    }

    /**
     * Returns the data of the row.
     *
     * @return a map containing the data of the row
     */
    public Map<String, Object> getData() {
        return data;
    }
    /**
     * Retrieves the value for the specified column.
     *
     * @param column the name of the column
     * @return the value of the specified column, or null if the column does not exist
     */
    public Object get(String column) {
        return data.get(column);
    }
}