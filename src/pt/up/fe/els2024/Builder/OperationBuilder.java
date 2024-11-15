package pt.up.fe.els2024.Builder;

import pt.up.fe.els2024.Builder.Operations.*;

public abstract class OperationBuilder {
    protected DataBaseBuilder db;
    protected abstract OperationBuilder executeOperation();

    protected DataBaseBuilder getBuilder() {
        return db;
    }

    public LoadOperation load(String fileType) {
        executeOperation();
        return new LoadOperation(getBuilder(), fileType);
    }

    public LoadJSONOperation loadJSON() {
        executeOperation();
        return new LoadJSONOperation(getBuilder());
    }

    public LoadXMLOperation loadXML() {
        executeOperation();
        return new LoadXMLOperation(getBuilder());
    }

    public LoadYAMLOperation loadYAML() {
        executeOperation();
        return new LoadYAMLOperation(getBuilder());
    }

    public RenameOperation rename() {
        executeOperation();
        return new RenameOperation(getBuilder());
    }
}
