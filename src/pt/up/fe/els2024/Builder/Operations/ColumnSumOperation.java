package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class ColumnSumOperation extends OperationBuilder {
    public ColumnSumOperation(DataBaseBuilder db) {
        super(db);
    }

    private String column;
    private String table;

    public ColumnSumOperation onColumn(String column) {
        this.column = column;
        return this;
    }

    public ColumnSumOperation onTable(String table) {
        this.table = table;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        //TODO: Implement this method
        return this;
    }
}
