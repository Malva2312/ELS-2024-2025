package pt.up.fe.els2024;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class CsvWriter {

    public static void writeToCsv(String outputFile, List<Map<String, String>> data) throws IOException {
        String[] header = {"File", "Criterion", "Splitter", "CPP Alpha", "Min Samples Split"};

        try (CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {
            writer.writeNext(header);

            for (Map<String, String> row : data) {
                writer.writeNext(new String[] {
                        row.get("File"),
                        row.get("Criterion"),
                        row.get("Splitter"),
                        row.get("CPP Alpha"),
                        row.get("Min Samples Split")
                });
            }
        }
    }
}
