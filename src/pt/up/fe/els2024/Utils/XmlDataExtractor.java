package pt.up.fe.els2024.Utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class XmlDataExtractor implements FileDataExtractor {
    private final XStream xstream = new XStream(new DomDriver());

    @Override
    public Map<String, Object> extractData(File file) throws IOException {
        xstream.alias("root", Map.class);
        try (FileInputStream inputStream = new FileInputStream(file)) {
            return (Map<String, Object>) xstream.fromXML(inputStream);
        }
    }
}
