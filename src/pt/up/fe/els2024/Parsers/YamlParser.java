package pt.up.fe.els2024.Parsers;

import java.util.Map;

public class YamlParser {
    public static Map<String, Object> parseRootKeys(String filePath) {
        // Implement YAML parsing logic to extract top-level key-values
        return Map.of("param1", 10, "param2", 20);
    }

    public static Map<String, Object> parseNestedKeys(String filePath, String nestedKey) {
        // Implement YAML parsing logic to extract key-values within "params"
        return Map.of("nestedParam1", "value1", "nestedParam2", "value2");
    }
}
