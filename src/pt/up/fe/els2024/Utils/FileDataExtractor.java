package pt.up.fe.els2024.Utils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public interface FileDataExtractor {
    Map<String, Object> extractData(File file) throws IOException;
}
