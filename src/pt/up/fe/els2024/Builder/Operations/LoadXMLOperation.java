package pt.up.fe.els2024.Builder.Operations;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadXMLOperation extends OperationBuilder {

    private String filePath;
    private String tableName;
    private List<String> fields;
    private List<String> nested;

    public LoadXMLOperation(DataBaseBuilder builder) {
        super(builder);
    }

    public LoadXMLOperation from(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public LoadXMLOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public LoadXMLOperation withAttributes(String... fields) {
        this.fields = List.of(fields);
        return this;
    }

    public LoadXMLOperation nestedIn(String... nested) {
        this.nested = List.of(nested);
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        try {
            List<File> filesToProcess = new ArrayList<>();
            File file = new File(filePath);

            if (file.isDirectory()) {
                // Adiciona todos os arquivos XML da pasta
                File[] xmlFiles = file.listFiles(f -> f.isFile() && f.getName().endsWith(".xml"));
                if (xmlFiles != null) {
                    filesToProcess.addAll(List.of(xmlFiles));
                }
            } else if (file.isFile() && file.getName().endsWith(".xml")) {
                // Adiciona apenas o arquivo especificado
                filesToProcess.add(file);
            }

            // Inicializa a tabela combinada
            Table table = new Table();

            XmlMapper xmlMapper = new XmlMapper();

            // Processa todos os files XML
            for (File xmlFile : filesToProcess) {
                System.out.println("Processing XML file: " + xmlFile.getAbsolutePath());
                Map<String, Object> xmlData = xmlMapper.readValue(xmlFile, Map.class);

                Map<String, Object> currentNode = xmlData;
                if (nested != null) {
                    for (String node : nested) {
                        currentNode = (Map<String, Object>) currentNode.get(node);
                        if (currentNode == null) {
                            throw new IllegalArgumentException("No <" + node + "> element found in file: " + xmlFile.getName());
                        }
                    }
                }

                Map<String, Object> resources = currentNode;

                // Se `fields` for null, inicializa com todas as chaves disponíveis
                if (fields == null) {
                    fields = new ArrayList<>(resources.keySet());
                }

                // Adiciona as colunas à tabela, verificando se já existem
                for (String field : fields) {
                    if (table.getColumn(field) == null) { // Verifica se a coluna já existe
                        table.addColumn(new Column(field, Object.class, null, true));
                    }
                }

                // Preenche as linhas da tabela
                Map<String, Object> rowValues = new HashMap<>();
                for (String field : fields) {
                    rowValues.put(field, resources.getOrDefault(field, null));
                }
                table.addRow(new Row(rowValues));
            }

            // Adiciona a tabela combinada ao DataBaseBuilder
            getBuilder().addTable(tableName, table);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return this;
    }
}
