package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

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
        for (Map.Entry<String, String> entry : columnsMap.entrySet()) {
            String oldName = entry.getKey();
            String newName = entry.getValue();

            try {
                table.renameColumn(oldName, newName);
                System.out.println("Renamed column '" + oldName + "' to '" + newName + "'");
            } catch (IllegalArgumentException e){
                System.err.println("Error renaming column: " + e.getMessage());
            }
        }
    }
}
