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
    private final String name;
    private final List<String> columns;
    //private final Map<String, Data>

    public Load(String name, Table table, List<File> files, List<String> columns) {
        this.name = name;
        this.table = table;
        this.columns = columns;

        this.files = new ArrayList<>(files);
        if (files.isEmpty()) {
            throw new IllegalArgumentException("Must specify at least one source file.");
        }
    }

    @Override
    public void execute() throws FileNotFoundException {
    }
}