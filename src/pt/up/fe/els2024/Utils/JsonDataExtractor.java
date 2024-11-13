package pt.up.fe.els2024.Utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class JsonDataExtractor implements FileDataExtractor {
    private final Gson gson = new Gson();

    @Override
    public Map<String, Object> extractData(File file) throws IOException {
        try (FileReader reader = new FileReader(file)) {
            Type type = new TypeToken<Map<String, Object>>() {}.getType();
            return gson.fromJson(reader, type);
        }
    }
}
