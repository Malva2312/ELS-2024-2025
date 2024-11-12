package pt.up.fe.els2024.Table;

public class Column {
    private String name;
    private Class<?> type;
    private Object defaultValue;
    private boolean nullable;

    public Column(String name, Class<?> type, Object defaultValue, boolean nullable) {
        this.name = name;
        this.type = type;
        this.defaultValue = defaultValue;
        this.nullable = nullable;
    }

    public String getName() {
        return name;
    }

    public Class<?> getType() {
        return type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public boolean isNullable() {
        return nullable;
    }

    public void setName(String name) {
        this.name = name;
    }

}
