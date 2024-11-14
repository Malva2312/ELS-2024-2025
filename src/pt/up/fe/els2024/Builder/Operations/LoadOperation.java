package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

public class LoadOperation extends OperationBuilder {
    private String source;
    private String targetName;
    private List<String> attributes;

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

    @Override
    protected OperationBuilder executeOperation() {
        //TODO: Implement this method
        return null;
    }
}
