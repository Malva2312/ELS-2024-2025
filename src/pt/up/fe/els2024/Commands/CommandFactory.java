package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;
import pt.up.fe.specs.util.SpecsCollections;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommandFactory {
    private static final Map<String, Table> tables = SpecsCollections.newHashMap();
    private static String id = "";

    public CommandFactory(String id, Map<String, Table> tables) {
        this.id = id;
        this.tables.putAll(tables);
    }

    public static Command createCommand(String type, Map<String, Object> args) {
        return switch (type) {
            case "load" -> createLoadCommand(args);
            case "save" -> createSaveCommand(args);
            case "rename" -> createRenameCommand(args);
            //default -> throw new IllegalArgumentException("Invalid command type: " + type);
            default -> null;
        };
    }

    private static Command createRenameCommand(Map<String, Object> args) {
        System.out.println("Creating rename command");

        // Get the table
        String tableName = (String) args.get("table");
        Table table = tables.get(tableName);

        // Get the columns map
        List<Map<String, String>> columnsMap = (List<Map<String, String>>) args.get("columns");
        Map<String, String> columns = new java.util.HashMap<>();
        for (Map<String, String> column : columnsMap) {
            columns.putAll(column);
        }

        return new Rename(table, columns);
    }

    private static Command createSaveCommand(Map<String, Object> args) {
        System.out.println("Creating save command");

        // Get the table
        String tableName = (String) args.get("table");
        Table table = tables.get(tableName);

        // Get the file
        String output = (String) args.get("out");

        // Get the columns
        List<String> columns = (List<String>) args.get("columns");

        return new Save(table, output, columns);
    }

    private static Command createLoadCommand(Map<String, Object> args) {
        System.out.println("Creating load command");

        // Get the file
        List<String> files = (List<String>) args.get("files");
        String tableName = (String) args.get("as");

        List<File> filesList = SpecsCollections.newArrayList();
        for (String file : files) {
            filesList.add(new File(file));
        }

        // Get the columns
        List<String> columns = (List<String>) args.get("columns");

        // Get the table if exists else create a new one
        Table table = tables.get(tableName);
        if (table == null) {
            table = new Table();
            tables.put(tableName, table);
        }

        return new Load(tableName, table, filesList, columns);
    }
}