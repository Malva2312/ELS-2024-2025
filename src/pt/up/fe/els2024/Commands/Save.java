package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.util.List;

public class Save implements Command {
    private final Table table;
    private final String file;
    private final List<String> columns;

    public Save(Table table, String filePath, List<String> columns){
        this.table = table;
        this.file = filePath;
        this.columns = columns;
    }
    @Override
    public void execute() {
        System.out.println("Save command executed");
    }
}
