package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;


public class PrintTableOperation extends OperationBuilder {
    public PrintTableOperation(DataBaseBuilder db, String table) {
        super(db);
        this.table = table;
    }

    private String table;

    @Override
    protected OperationBuilder executeOperation() {
        if (table != null) {
            var table = db.getTable(this.table);
            if (table != null) {
                table.printTable();
            } else {
                throw new IllegalArgumentException("Table " + this.table + " does not exist.");
            }
        } else {
            throw new IllegalArgumentException("Table must be specified.");
        }
        return this;
    }
}
