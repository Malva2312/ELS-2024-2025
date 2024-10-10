package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Load implements Command {

    private final Table table;
    private final List<File> files;
    private final String id;
    private final List<String> columns;
    //private final Map<String, Data>

    public Load(String id, Table table, List<File> files, List<String> columns) {
        this.id = id;
        this.table = table;
        this.columns = columns;

        this.files = new ArrayList<>(files);
        if (files.isEmpty()) {
            throw new IllegalArgumentException("Must specify at least one source file.");
        }
    }

    @Override
    public void execute() throws FileNotFoundException {

        Yaml yaml = new Yaml();
        try (InputStream inputStream = new FileInputStream(this.files.get(0))) {
            // Expecting a list of maps
            Map<String, Object> cmds = yaml.load(inputStream);
            Table table = new Table();
            //= cmds.keySet().toString();
            System.out.printf("KEYSET -> " + cmds.keySet().toString());

            List<String> row = new ArrayList<>();
            // Iterate over the list
            for (var command : cmds.entrySet()) {
                // Get yaml keys
                String key = command.getKey().toString();
                //System.out.printf("\nKEY -> " + key);
                table.addColumnDefault(key);
                // Get corresponding values
                table.addRowDefault(command.getValue().toString());

                /*for (var value : command.getValue().toString().split(",")) {
                    //String value = command.getValue().toString();
                    System.out.printf("\nVALUE -> " + command.getValue().toString());
                    table.addRow(value);
                }*/
            }

            System.out.println("Load command executed");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}