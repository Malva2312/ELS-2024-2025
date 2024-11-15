package pt.up.fe.els2024.Builder.Operations;

import org.yaml.snakeyaml.Yaml;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadYAMLOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    public LoadYAMLOperation(DataBaseBuilder builder) {
        super(builder);
    }

    public LoadYAMLOperation from(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public LoadYAMLOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public LoadYAMLOperation withAttributes(String... fields) {
        this.fields = fields.length > 0 ? List.of(fields) : null; // Add all columns if none are provided
        return this;
    }

    public LoadYAMLOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        try {
            List<File> filesToProcess = new ArrayList<>();
            File file = new File(filePath);

            if (file.isDirectory()) {
                // Adiciona todos os arquivos YAML da pasta
                File[] yamlFiles = file.listFiles(f -> f.isFile() && f.getName().endsWith(".yaml"));
                if (yamlFiles != null) {
                    filesToProcess.addAll(List.of(yamlFiles));
                }
            } else if (file.isFile() && file.getName().endsWith(".yaml")) {
                // Adiciona apenas o arquivo especificado
                filesToProcess.add(file);
            }

            // Inicializa a tabela combinada
            Table table = new Table();

            Yaml yaml = new Yaml();

            for (File yamlFile : filesToProcess) {

                try (InputStream inputStream = new FileInputStream(yamlFile)) {
                    Map<String, Object> yamlData = yaml.load(inputStream);

                    Map<String, Object> rowValues = new HashMap<>();

                    // Extrai pares chave-valor de nível raiz com tipos não compostos
                    for (Map.Entry<String, Object> entry : yamlData.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();

                        if (isNonComposite(value)) {
                            if (fields == null || fields.contains(key)) {
                                if (table.getColumn(key) == null) {
                                    table.addColumn(new Column(key, Object.class, null, true));
                                }
                                rowValues.put(key, value);
                            }
                        }
                    }

                    // Navega nos caminhos, se especificado
                    if (nested != null && !nested.isEmpty()) {
                        Map<String, Object> currentLevel = yamlData;
                        for (int i = 0; i < nested.size(); i++) {
                            String currentKey = nested.get(i);
                            Object nestedValue = currentLevel.get(currentKey);

                            if (nestedValue instanceof Map && i < nested.size() - 1) {
                                currentLevel = (Map<String, Object>) nestedValue; // Desce mais um nível
                            } else if (i == nested.size() - 1 && nestedValue instanceof Map) {
                                // Extrai pares chave-valor no nível final
                                Map<String, Object> finalLevel = (Map<String, Object>) nestedValue;
                                for (Map.Entry<String, Object> nestedEntry : finalLevel.entrySet()) {
                                    String nestedKey = nestedEntry.getKey();
                                    Object nestedValueEntry = nestedEntry.getValue();

                                    if (isNonComposite(nestedValueEntry) &&
                                            (fields == null || fields.contains(nestedKey))) {
                                        if (table.getColumn(nestedKey) == null) {
                                            table.addColumn(new Column(nestedKey, Object.class, null, true));
                                        }
                                        rowValues.put(nestedKey, nestedValueEntry);
                                    }
                                }
                            } else {
                                break; // Caminho inválido ou valor não mapeável encontrado
                            }
                        }
                    }

                    // Adiciona uma linha para cada arquivo YAML processado
                    table.addRow(new Row(rowValues));
                }
            }

            // Adiciona a tabela combinada ao DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            System.err.println("Error when loading YAML: " + e.getMessage());
        }

        return this;
    }

    // Helper method to check for non-composite types
    private boolean isNonComposite(Object value) {
        return value == null || value instanceof String || value instanceof Number || value instanceof Boolean;
    }
}
