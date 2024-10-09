package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;
import java.io.*;

public class ConfigLoader {

    public static Map<String, Object> loadConfig(String configFilePath) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = ConfigLoader.class.getClassLoader().getResourceAsStream(configFilePath)) {
            System.out.printf("INSIDE CONFIG LOADER!!!\n");
            return yaml.load(inputStream);
        }
    }
}
