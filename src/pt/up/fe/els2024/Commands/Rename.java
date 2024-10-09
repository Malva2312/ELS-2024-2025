package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;
import java.util.Map;

public class Rename implements Command {
    private final Table table;
    private final Map<String, String> renameMapping; // Mapping of column renames

    public Rename(Table table, Map<String, String> renameMapping) {
        this.table = table;
        this.renameMapping = renameMapping;
    }

    @Override
    public void execute() {
        System.out.println("Rename command executed");
        renameColumns();
    }

    private void renameColumns() {
        for (int i = 0; i < table.getColumns().size(); i++) {
            String currentColumn = table.getColumns().get(i);
            if (renameMapping.containsKey(currentColumn)) {
                String newColumnName = renameMapping.get(currentColumn);
                table.getColumns().set(i, newColumnName); // Rename the column
                System.out.printf("Renamed column '%s' to '%s'\n", currentColumn, newColumnName);
            }
        }
    }
}
