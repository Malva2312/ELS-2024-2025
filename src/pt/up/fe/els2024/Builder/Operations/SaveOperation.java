package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveOperation extends OperationBuilder {
    private String fileName;
    private String type;
    private List<String> tablesToSave;

    public SaveOperation(DataBaseBuilder db) {
        super(db);
    }

    public SaveOperation tables(String... tables) {
        this.tablesToSave = List.of(tables);
        return this;
    }

    public SaveOperation to(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public SaveOperation as(String type) {
        this.type = type.toLowerCase(); // Ensure type is case-insensitive
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        if (fileName == null || type == null || tablesToSave == null || tablesToSave.isEmpty()) {
            throw new IllegalStateException("File name, type, and tables to save must be specified.");
        }

        try (FileWriter writer = new FileWriter(fileName)) {
            for (String tableName : tablesToSave) {
                Table table = db.getTable(tableName); // Assume DataBaseBuilder provides getTable(String tableName)
                if (table == null) {
                    throw new IllegalArgumentException("Table " + tableName + " does not exist.");
                }

                switch (type) {
                    case "csv":
                        writeCSV(writer, table);
                        break;
                    case "xml":
                        writeXML(writer, table);
                        break;
                    case "yaml":
                        writeYAML(writer, table);
                        break;
                    case "json":
                        writeJSON(writer, table);
                        break;
                    case "html":
                        writeHTML(writer, table);
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported file type: " + type);
                }
                writer.write("\n\n"); // Separate tables with a blank line
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to save tables: " + e.getMessage(), e);
        }

        return this;
    }

    private void writeCSV(FileWriter writer, Table table) throws IOException {
        // Write column headers
        writer.write(String.join(",", table.getColumns().stream().map(c -> c.getName()).toList()));
        writer.write("\n");

        // Write rows
        for (var row : table.getRows()) {
            writer.write(String.join(",", table.getColumns().stream()
                    .map(c -> String.valueOf(row.getValue(c.getName())))
                    .toList()));
            writer.write("\n");
        }
    }

    private void writeXML(FileWriter writer, Table table) throws IOException {
        writer.write("<table>\n");
        for (var row : table.getRows()) {
            writer.write("  <row>\n");
            for (var column : table.getColumns()) {
                writer.write(String.format("    <%s>%s</%s>\n",
                        column.getName(), row.getValue(column.getName()), column.getName()));
            }
            writer.write("  </row>\n");
        }
        writer.write("</table>\n");
    }

    private void writeYAML(FileWriter writer, Table table) throws IOException {
        for (var row : table.getRows()) {
            writer.write("-\n");
            for (var column : table.getColumns()) {
                writer.write(String.format("  %s: %s\n",
                        column.getName(), row.getValue(column.getName())));
            }
        }
    }

    private void writeJSON(FileWriter writer, Table table) throws IOException {
        writer.write("[\n");
        for (int i = 0; i < table.getRows().size(); i++) {
            var row = table.getRows().get(i);
            writer.write("  {\n");
            for (int j = 0; j < table.getColumns().size(); j++) {
                var column = table.getColumns().get(j);
                writer.write(String.format("    \"%s\": \"%s\"",
                        column.getName(), row.getValue(column.getName())));
                if (j < table.getColumns().size() - 1) {
                    writer.write(",");
                }
                writer.write("\n");
            }
            writer.write("  }");
            if (i < table.getRows().size() - 1) {
                writer.write(",");
            }
            writer.write("\n");
        }
        writer.write("]\n");
    }

    private void writeHTML(FileWriter writer, Table table) throws IOException {
        writer.write("<table>\n");
        writer.write("  <thead>\n");
        writer.write("    <tr>\n");
        for (var column : table.getColumns()) {
            writer.write(String.format("      <th>%s</th>\n", column.getName()));
        }
        writer.write("    </tr>\n");
        writer.write("  </thead>\n");
        writer.write("  <tbody>\n");
        for (var row : table.getRows()) {
            writer.write("    <tr>\n");
            for (var column : table.getColumns()) {
                writer.write(String.format("      <td>%s</td>\n", row.getValue(column.getName())));
            }
            writer.write("    </tr>\n");
        }
        writer.write("  </tbody>\n");
        writer.write("</table>\n");
    }
}
