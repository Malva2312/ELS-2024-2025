package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table;
import pt.up.fe.specs.util.SpecsCollections;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CommandFactory {
    private static final Table table = new Table();
    private static String id = "";

    public CommandFactory(String id) {
        this.id = id;
    }

    public static Command createCommand(String type, Map<String, Object> args) {
        switch (type) {
            case "load": {
                Object filesObj = args.get("files");
                Object columnsObj = args.getOrDefault("columns", Collections.emptyList());
                List<File> files = SpecsCollections.cast((List<?>) filesObj, File.class);
                List<String> columns = SpecsCollections.cast((List<?>) columnsObj, String.class);
                return new Load(id, table, files, columns);
            }
            case "rename": {
                Object newNameS = args.get("newName");
                String newName = (String) newNameS;
                return new Rename(table, newName);
            }
            case "save": {
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