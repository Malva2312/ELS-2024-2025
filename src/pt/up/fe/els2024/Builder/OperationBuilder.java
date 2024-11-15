package pt.up.fe.els2024.Builder;

import pt.up.fe.els2024.Builder.Operations.LoadJSONOperation;
import pt.up.fe.els2024.Builder.Operations.LoadOperation;
import pt.up.fe.els2024.Builder.Operations.LoadXMLOperation;
import pt.up.fe.els2024.Builder.Operations.LoadYAMLOperation;

public abstract class OperationBuilder {
    protected final DataBaseBuilder db;

    protected OperationBuilder(DataBaseBuilder db) {
        this.db = db;
    }

    protected abstract OperationBuilder executeOperation();

    protected DataBaseBuilder getBuilder() {
        return db;
    }

    public OperationBuilder end() {
        return executeOperation();
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

    public LoadOperation load(String fileType) {
        executeOperation();
        return new LoadOperation(getBuilder(), fileType);
    }
}
