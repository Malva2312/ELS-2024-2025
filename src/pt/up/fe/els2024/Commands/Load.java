package pt.up.fe.els2024.Commands;

import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;
import pt.up.fe.els2024.Utils.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Load implements Command {

    private final String id;
    private final String path; // Caminho para file ou pasta
    private final String tableName; // Nome da tabela a ser registada
    private final Table table;
    private final List<String> attributes; // Lista de atributos a serem carregados
    private final Map<String, FileDataExtractor> extractors; // Mapeia extensões de arquivos para extractors
    private final List<File> files;

    // Construtor que inicializa os campos
    public Load(String id, String path, Table table, List<File> files, String tableName, List<String> attributes) {
        this.id = id;
        this.path = path;
        this.table = table;
        this.files = new ArrayList<>(files);
        this.tableName = tableName;
        this.attributes = attributes != null ? attributes : new ArrayList<>();

        // Inicializa os extractors para YAML, JSON e XML
        this.extractors = new HashMap<>();
        this.extractors.put("yaml", new YamlDataExtractor());
        this.extractors.put("xml", new XmlDataExtractor());
        this.extractors.put("json", new JsonDataExtractor());
    }

    @Override
    public void execute() throws FileNotFoundException {
        File fileOrDirectory = new File(path);
        if (!fileOrDirectory.exists()) {
            throw new FileNotFoundException("Path not found: " + path);
        }

        List<Map<String, Object>> allData = new ArrayList<>();
        if (fileOrDirectory.isFile()) {
            allData.add(loadFileData(fileOrDirectory));
        } else if (fileOrDirectory.isDirectory()) {
            for (File file : Objects.requireNonNull(fileOrDirectory.listFiles())) {
                if (file.isFile()) {
                    allData.add(loadFileData(file));
                }
            }
        }

        createAndPopulateTable(allData);
    }

    private Map<String, Object> loadFileData(File file) throws FileNotFoundException {
        String extension = getFileExtension(file);
        FileDataExtractor extractor = extractors.get(extension);

        if (extractor == null) {
            throw new IllegalArgumentException("Unsupported file format: " + extension);
        }

        try {
            Map<String, Object> data = extractor.extractData(file);
            if (!attributes.isEmpty()) {
                data.keySet().retainAll(attributes);
            }
            return data;
        } catch (IOException e) {
            throw new FileNotFoundException("Error reading file: " + file.getName());
        }
    }

    private void createAndPopulateTable(List<Map<String, Object>> allData) {
        List<Column> columns = new ArrayList<>();
        Map<String, Object> firstRow = allData.get(0);

        for (String attribute : attributes.isEmpty() ? firstRow.keySet() : attributes) {
            Object sampleValue = firstRow.get(attribute);
            Class<?> columnType = sampleValue != null ? sampleValue.getClass() : String.class;
            columns.add(new Column(attribute, columnType, null, true));
        }

        Table table = new Table(columns);
        for (Map<String, Object> data : allData) {
            Map<String, Object> rowValues = new HashMap<>();
            for (Column column : columns) {
                rowValues.put(column.getName(), data.getOrDefault(column.getName(), ""));
            }
            table.addRow(rowValues);
        }

        TableRegistry.registerTable(tableName, table);
        System.out.println("Table '" + tableName + "' loaded with data.");
    }

    private String getFileExtension(File file) {
        String fileName = file.getName();
        int lastIndex = fileName.lastIndexOf(".");
        return (lastIndex == -1) ? "" : fileName.substring(lastIndex + 1).toLowerCase();
    }
}
