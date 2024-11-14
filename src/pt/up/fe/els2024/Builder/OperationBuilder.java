package pt.up.fe.els2024.Builder;

import pt.up.fe.els2024.Builder.Operations.LoadOperation;

public abstract class OperationBuilder {
    protected DataBaseBuilder db;
    protected abstract OperationBuilder executeOperation();

    protected DataBaseBuilder getBuilder() {
        return db;
    }

    public LoadOperation load() {
        //var operation = executeOperation();
        //getBuilder().addOperation(operation);
        return new LoadOperation(getBuilder());
    }


}
