package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;
import pt.up.fe.specs.util.SpecsCollections;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CommandFactory {
    private static final Table table = new Table(); // Singleton Table for all commands

    public static Command createCommand(String type, Map<String, Object> args) {
        switch (type) {
            case "load": {
                // Extract 'files' and 'columns' from args
                Object filesObj = args.get("files");
                Object columnsObj = args.getOrDefault("columns", Collections.emptyList());

                List<String> files = SpecsCollections.cast((List<?>) filesObj, String.class);
                List<String> columns = SpecsCollections.cast((List<?>) columnsObj, String.class);

                return new Load(table, files, columns);
            }

            case "rename": {
                // Extract 'columns' mapping for rename from args
                Object renameColumnsObj = args.get("columns");

                // Manually cast the map to Map<String, String>
                Map<String, String> renameColumns = new HashMap<>();
                if (renameColumnsObj instanceof Map<?, ?>) {
                    for (Map.Entry<?, ?> entry : ((Map<?, ?>) renameColumnsObj).entrySet()) {
                        if (entry.getKey() instanceof String && entry.getValue() instanceof String) {
                            renameColumns.put((String) entry.getKey(), (String) entry.getValue());
                        } else {
                            throw new IllegalArgumentException("Invalid key/value type in rename columns map. Expected String.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Columns should be a map for rename operation.");
                }

                // Pass the table and the rename mapping to the Rename command
                return new Rename(table, renameColumns);
            }

            case "save": {
                // Extract 'file' and 'columns' for saving from args
                Object fileObj = args.get("file");
                Object columnsObj = args.getOrDefault("columns", Collections.emptyList());

                String file = (String) fileObj;
                List<String> columns = SpecsCollections.cast((List<?>) columnsObj, String.class);

                return new Save(table, file, columns);
            }

            default:
                throw new IllegalArgumentException(type + " is not a valid instruction type.");
        }
    }
}
