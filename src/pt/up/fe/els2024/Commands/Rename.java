package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table.Table;

import java.util.Map;

/**
 * The Rename class implements the Command interface and is responsible for renaming columns in a table.
 */
public class Rename implements Command {
    // The table containing the columns to be renamed
    private final Table table;
    // A map where the key is the old column name and the value is the new column name
    private final Map<String, String> columnsMap;

    /**
     * Constructs a Rename command with the specified table and columns map.
     *
     * @param table The table containing the columns to be renamed.
     * @param columnsMap A map where the key is the old column name and the value is the new column name.
     */
    public Rename(Table table, Map<String, String> columnsMap) {
        this.table = table;
        this.columnsMap = columnsMap;
    }

    /**
     * Executes the Rename command, renaming the columns in the table as specified in the columns map.
     */
    @Override
    public void execute() {
        System.out.println(columnsMap);

        for (Map.Entry<String, String> entry : columnsMap.entrySet()) {
            String oldName = entry.getKey();
            String newName = entry.getValue();

            try {
                table.renameColumn(oldName, newName);
                System.out.println("Renamed column '" + oldName + "' to '" + newName + "'");
            } catch (IllegalArgumentException e) {
                System.err.println("Error renaming column: " + oldName + e.getMessage() + e.getMessage());
            }
        }
    }
}