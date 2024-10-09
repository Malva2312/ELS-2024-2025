package pt.up.fe.els2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtractionController {

    public static void processYamlFiles(Map<String, Object> config) throws IOException {
        String inputFolder = (String) config.get("assignment1Files/decision_tree_1.yaml");
        String outputFile = (String) config.get("assignment1Files/decision_tree_1.csv");

        List<Map<String, String>> data = new ArrayList<>();

        File folder = new File(inputFolder);
        File[] listOfFiles = folder.listFiles((dir, name) -> name.endsWith(".yaml"));

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                FileInputStream fis = new FileInputStream(file);
                Map<String, Object> params = YamlParser.extractParamsFromYaml(fis);
                System.out.printf("!!!!HERE!!!!\n");
                Map<String, String> row = new HashMap<>();
                row.put("File", file.getName());
                row.put("Criterion", params.get("Criterion").toString());
                row.put("Splitter", params.get("Splitter").toString());
                row.put("CPP Alpha", params.get("CPP Alpha").toString());
                row.put("Min Samples Split", params.get("Min Samples Split").toString());

                data.add(row);
            }
        }

        CsvWriter.writeToCsv(outputFile, data);
    }

    public static void main(String[] args) throws IOException {
        Map<String, Object> config = ConfigLoader.loadConfig("assignment1Files/decision_tree_1.yaml");
        processYamlFiles(config);
    }
}
