package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
            for (int i = 0; i < Table.getNumberOfRows(table); i++) {
                StringBuilder row = new StringBuilder();
                for (String column : columns) {
                    row.append(table.getCell(i, column)).append(",");
                }
                writer.write(row.toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Save command executed");
    }
}
