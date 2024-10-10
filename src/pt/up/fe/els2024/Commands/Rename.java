package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.util.List;

public class Rename implements Command {
    private final Table table;
    private final String newName;

    public Rename(Table table, String newName){
        this.table = table;
        this.newName = newName;
    }
    @Override
    public void execute() {
        table.renameTable(table, newName);
        System.out.println("Rename command executed");
    }
}
