package pt.up.fe.els2024.Utils;

import pt.up.fe.els2024.Table.Table;

import java.util.HashMap;
import java.util.Map;

public class TableRegistry {
    private static final Map<String, Table> tables = new HashMap<>();

    public static void registerTable(String name, Table table) {
        tables.put(name, table);
    }

    public static Table getTable(String name) {
        return tables.get(name);
    }
}
