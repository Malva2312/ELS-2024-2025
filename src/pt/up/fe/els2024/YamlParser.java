package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class YamlParser {

    public static Map<String, Object> extractParamsFromYaml(InputStream inputStream) {
        Yaml yaml = new Yaml();
        Map<String, Object> data = yaml.load(inputStream);

        Map<String, Object> params = (Map<String, Object>) data.get("params");

        return Map.of(
                "Criterion", params.getOrDefault("criterion", ""),
                "Splitter", params.getOrDefault("splitter", ""),
                "CPP Alpha", params.getOrDefault("ccp_alpha", 0),
                "Min Samples Split", params.getOrDefault("min_samples_split", 2)
        );
    }

}
