package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table.Table;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * The Save class implements the Command interface and is responsible for saving data from a table to a file.
 */
public class Save implements Command {
    // The table containing the data to be saved
    private final Table table;
    // The file path where the data will be saved
    private final String file;
    // The list of column names to be saved
    private final List<String> columns;

    /**
     * Constructs a Save command with the specified table, file path, and columns.
     *
     * @param table The table containing the data to be saved.
     * @param filePath The file path where the data will be saved.
     * @param columns The list of column names to be saved.
     */
    public Save(Table table, String filePath, List<String> columns){
        this.table = table;
        this.file = filePath;
        this.columns = columns;
    }

    /**
     * Executes the Save command, saving data from the table to the specified file.
     */
    @Override
    public void execute() {
        System.out.println(file);
        // create a new file or overwrite the existing file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // Write the header (column names) if there are in columns
            // if columns in null or empty, write all columns
            if (columns == null || columns.isEmpty()) {
                writer.write(String.join(",", table.getColumns()));
            } else {
                writer.write(String.join(",", columns));
            }

            writer.newLine();

            // Filter rows cell by columns
            List<String> newColumns;
            for (int i = 0; i < Table.getNumberOfRows(table); i++) {
                StringBuilder row = new StringBuilder();
                if (columns == null || columns.isEmpty()) {
                    newColumns = table.getColumns();
                }
                else {
                    newColumns = columns;
                }

                for (String column : newColumns) {
                    row.append(table.getCell(i, column)).append(",");
                }
                writer.write(row.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Save command executed");
    }
}