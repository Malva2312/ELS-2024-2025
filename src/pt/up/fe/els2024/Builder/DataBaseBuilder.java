package pt.up.fe.els2024.Builder;

import jdk.dynalink.Operation;
import org.apache.commons.collections4.map.ListOrderedMap;
import pt.up.fe.els2024.Table.Table;

import java.util.List;

public class DataBaseBuilder {
    // Tables from the Table class
    private final ListOrderedMap<String, Table> tables;

    public DataBaseBuilder() {
        this.tables = new ListOrderedMap<>();
    }



}
