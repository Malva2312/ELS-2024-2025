package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.util.List;

public class Rename implements Command {
    private final Table table;

    public Rename(Table table){
        this.table = table;
    }
    @Override
    public void execute() {
        System.out.println("Rename command executed");
    }
}
