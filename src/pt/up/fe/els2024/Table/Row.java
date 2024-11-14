package pt.up.fe.els2024.Table;

import java.util.Map;

public class Row {
    private Map<String, Object> data;

    public Row(Map<String, Object> values) {
        this.data = values;
    }

    public Object getValue(String columnName) {
        return data.get(columnName);
    }

    public void setValue(String columnName, Object value) {
        data.put(columnName, value);
    }

    public Map<String, Object> getData() {
        return data;
    }
}
