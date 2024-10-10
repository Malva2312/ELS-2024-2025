package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Rename implements Command {
    private final Table table;
    private final Map<String, String> columnsMap;

    public Rename(Table table, Map<String, String> columnsMap) {
        this.table = table;
        this.columnsMap = columnsMap;
    }

    @Override
    public void execute() {


    }
}
