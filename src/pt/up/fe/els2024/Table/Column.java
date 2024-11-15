package pt.up.fe.els2024.Table;

/**
 * Represents a column in a table with a name, type, default value, and nullability.
 */
public class Column {
    private String name;
    private Class<?> type;
    private Object defaultValue;
    private boolean nullable;

    /**
     * Constructs a new Column with the specified name, type, default value, and nullability.
     *
     * @param name the name of the column
     * @param type the type of the column
     * @param defaultValue the default value of the column
     * @param nullable whether the column can be null
     */
    public Column(String name, Class<?> type, Object defaultValue, boolean nullable) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
        this.nullable = nullable;
    }

    /**
     * Returns the name of the column.
     *
     * @return the name of the column
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the type of the column.
     *
     * @return the type of the column
     */
    public Class<?> getType() {
        return type;
    }

    /**
     * Returns the default value of the column.
     *
     * @return the default value of the column
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * Returns whether the column can be null.
     *
     * @return true if the column can be null, false otherwise
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * Sets the name of the column.
     *
     * @param name the new name of the column
     */
    public void setName(String name) {
        this.name = name;
    }

}
