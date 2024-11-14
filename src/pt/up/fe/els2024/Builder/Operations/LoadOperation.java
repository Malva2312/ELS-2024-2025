package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

public class LoadOperation extends OperationBuilder {
    private String source;
    private String targetName;
    private List<String> attributes;
    private String format;

    public LoadOperation(DataBaseBuilder builder) {
        this.db = builder;
    }

    public LoadOperation from(String source) {
        this.source = source;
        return this;
    }

    public LoadOperation into(String targetName) {
        this.targetName = targetName;
        return this;
    }

    public LoadOperation withAttributes(String... attributes) {
        this.attributes = List.of(attributes);
        return this;
    }

    public LoadOperation fromXML(String source) {
        this.source = source;
        this.format = "xml";
        return this;
    }

    public LoadOperation fromCSV(String source) {
        this.source = source;
        this.format = "csv";
        return this;
    }

    public LoadOperation fromJSON(String source) {
        this.source = source;
        this.format = "json";
        return this;
    }

    public LoadOperation fromYAML(String source) {
        this.source = source;
        this.format = "yaml";
        return this;
    }


    @Override
    protected OperationBuilder executeOperation() {
        //TODO: Implement this method
        return null;
    }
}
