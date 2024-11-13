package pt.up.fe.els2024.Utils;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class YamlDataExtractor implements FileDataExtractor {
    @Override
    public Map<String, Object> extractData(File file) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = new FileInputStream(file)) {
            return yaml.load(inputStream);
        }
    }
}
