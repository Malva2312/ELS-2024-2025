package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table.Table;
import pt.up.fe.specs.util.SpecsCollections;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * This class is responsible for creating different types of commands
 * based on the provided type and arguments.
 */
public class CommandFactory {
    // A map to store tables with their names as keys
    private static final Map<String, Table> tables = SpecsCollections.newHashMap();
    // A static variable to store the ID
    private static String id = "";

    /**
     * Constructor for CommandFactory.
     *
     * @param id     The identifier for the command factory.
     * @param tables A map of table names to Table objects.
     */
    public CommandFactory(String id, Map<String, Table> tables) {
        this.id = id;
        this.tables.putAll(tables);
    }

    /**
     * Creates a command based on the provided type and arguments.
     *
     * @param type The type of command to create (e.g., "load", "save", "rename").
     * @param args A map of arguments required to create the command.
     * @return The created command.
     * @throws IllegalArgumentException if the command type is invalid.
     */
    public static Command createCommand(String type, Map<String, Object> args) {
        return switch (type) {
            case "load" -> createLoadCommand(args);
            case "save" -> createSaveCommand(args);
            case "rename" -> createRenameCommand(args);
            default -> throw new IllegalArgumentException("Invalid command type: " + type);
        };
    }

    /**
     * Creates a Rename command based on the provided arguments.
     *
     * @param args A map of arguments required to create the Rename command.
     *             Expected keys are:
     *             - "table": The name of the table to rename columns in.
     *             - "columns": A list of maps where each map contains old and new column names.
     * @return The created Rename command.
     */
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

    /**
     * Creates a Save command based on the provided arguments.
     *
     * @param args A map of arguments required to create the Save command.
     *             Expected keys are:
     *             - "table": The name of the table to save.
     *             - "out": The output file path where the table will be saved.
     *             - "columns": A list of column names to be saved.
     * @return The created Save command.
     */
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


    /**
     * Creates a Load command based on the provided arguments.
     *
     * @param args A map of arguments required to create the Load command.
     *             Expected keys are:
     *             - "files": A list of file paths to load data from.
     *             - "as": The name to assign to the table.
     *             - "columns": A list of column names to be loaded.
     * @return The created Load command.
     */
    private static Command createLoadCommand(Map<String, Object> args) {
        System.out.println("Creating load command");

        // Get the file paths
        List<String> files = (List<String>) args.get("files");
        String tableName = (String) args.get("as");

        // Convert file paths to File objects
        List<File> filesList = SpecsCollections.newArrayList();
        for (String file : files) {
            filesList.add(new File(file));
        }

        // Get the columns
        List<String> columns = (List<String>) args.get("columns");

        // Get the table if it exists, else create a new one
        Table table = tables.get(tableName);
        if (table == null) {
            table = new Table();
            tables.put(tableName, table);
        }

        return new Load(tableName, table, filesList, columns);
    }
}
