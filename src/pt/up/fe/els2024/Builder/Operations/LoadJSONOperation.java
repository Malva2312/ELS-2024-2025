package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class LoadJSONOperation extends OperationBuilder {
    @Override
    protected OperationBuilder executeOperation() {
        return null;
    }

    public LoadJSONOperation(DataBaseBuilder builder) {
        super();
    }

    protected String filePath;
    protected String tableName;

    public LoadJSONOperation from(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public LoadJSONOperation into(String tableName) {
        this.tableName = tableName;
        return this;
    }
}
