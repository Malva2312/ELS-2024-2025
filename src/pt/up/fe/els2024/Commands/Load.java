package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.util.List;

public class Load implements Command {

    private final Table table;
    private final List<String> files;
    private final List<String> columns;

    public Load(Table table, List<String> filePaths, List<String> columns){
        this.table = table;
        this.files = filePaths;
        this.columns = columns;
    }

    @Override
    public void execute() {
        System.out.println("Load command executed");
    }


}
