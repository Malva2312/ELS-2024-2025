package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Column;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MaxTimePercentagePerFileOperation extends OperationBuilder {

    private String filePath;
    private String targetTable;

    public MaxTimePercentagePerFileOperation(DataBaseBuilder db) {
        super(db);
    }

    public MaxTimePercentagePerFileOperation fromPath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public MaxTimePercentagePerFileOperation toTable(String targetTable) {
        this.targetTable = targetTable;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        if (filePath == null || targetTable == null) {
            throw new IllegalStateException("File path and target table name must be specified.");
        }

        try {
            File file = new File(filePath);
            File[] jsonFiles = file.isDirectory() ? file.listFiles(f -> f.isFile() && f.getName().endsWith(".json")) : new File[]{file};

            if (jsonFiles == null || jsonFiles.length == 0) {
                throw new IllegalStateException("No JSON files found in the specified path.");
            }

            // Criação da tabela de resultados
            Table resultTable = new Table();
            resultTable.addColumn(new Column("file", String.class, null, true));
            resultTable.addColumn(new Column("name", String.class, null, true));
            resultTable.addColumn(new Column("max_time%", Double.class, null, true));
            resultTable.addColumn(new Column("seconds", Double.class, null, true));

            // Processa cada arquivo JSON individualmente
            ObjectMapper mapper = new ObjectMapper();
            for (File jsonFile : jsonFiles) {
                JsonNode root = mapper.readTree(jsonFile);
                JsonNode functionsArray = root.get("functions");

                if (functionsArray != null && functionsArray.isArray()) {
                    Double maxTimePercentage = null;
                    String maxName = null;
                    Double maxSeconds = null;

                    for (JsonNode node : functionsArray) {
                        JsonNode timeNode = node.get("time%");
                        JsonNode nameNode = node.get("name");
                        JsonNode secondsNode = node.get("seconds");

                        if (timeNode != null && nameNode != null) {
                            try {
                                Double currentTimePercentage = timeNode.asDouble();
                                if (maxTimePercentage == null || currentTimePercentage > maxTimePercentage) {
                                    maxTimePercentage = currentTimePercentage;
                                    maxName = nameNode.asText();
                                    maxSeconds = secondsNode != null ? secondsNode.asDouble() : null;
                                }
                            } catch (Exception e) {
                                System.err.println("Error parsing time% value: " + timeNode.asText());
                            }
                        }
                    }

                    if (maxTimePercentage != null && maxName != null) {
                        Map<String, Object> resultRowData = new HashMap<>();
                        resultRowData.put("file", jsonFile.getName());
                        resultRowData.put("name", maxName);
                        resultRowData.put("max_time%", maxTimePercentage);
                        resultRowData.put("seconds", maxSeconds);
                        resultTable.addRow(new Row(resultRowData));
                    }
                }
            }

            // Adiciona a tabela de resultados ao DataBaseBuilder
            db.addTable(targetTable, resultTable);

        } catch (Exception e) {
            System.err.println("Error processing JSON files: " + e.getMessage());
        }

        return this;
    }
}
