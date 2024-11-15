package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class ColumnMeanOperation extends OperationBuilder {
    public ColumnMeanOperation(DataBaseBuilder db) {
        super(db);
    }

    private String column;
    private String table;

    public ColumnMeanOperation onColumn(String column) {
        this.column = column;
        return this;
    }

    public ColumnMeanOperation onTable(String table) {
        this.table = table;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        //TODO: Implement this method
        return this;
    }
}
