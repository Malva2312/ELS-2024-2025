package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.OperationBuilder;

public class LoadJSONOperation extends OperationBuilder {
    private String source;
    private String targetName;
    private String format;

    public LoadJSONOperation(String table) {
        super(table);
    }

    public LoadJSONOperation fromJSON(String source) {
        this.source = source;
        return this;
    }

    public LoadJSONOperation into(String targetName) {
        this.targetName = targetName;
        return this;
    }

    public LoadJSONOperation withFormat(String format) {
        this.format = format;
        return this;
    }
}
