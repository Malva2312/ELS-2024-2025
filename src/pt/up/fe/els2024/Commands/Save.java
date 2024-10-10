package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./assignment1Files/configurationFile.csv"))) {
            // Write the header (column names)
            writer.write(String.join(",", table.getColumns()));
            writer.newLine();

            // Write each row
            for (var entry : table.getRows().entrySet()) {
                String rowKey = entry.getKey();
                List<String> rowValues = entry.getValue();
                writer.write(rowKey + "," + String.join(",", rowValues));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Save command executed");
    }
}
