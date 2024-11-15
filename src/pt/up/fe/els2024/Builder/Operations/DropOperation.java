package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;

public class DropOperation extends OperationBuilder {

    private String tableName;

    // Constructor for the DropTableOperation
    public DropOperation(DataBaseBuilder db) {
        super(db);
    }

    // Method to specify the table to be dropped
    public DropOperation table(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        // Check if the table exists in the database
        Table table = db.getTable(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table '" + tableName + "' does not exist.");
        }

        // Remove the table from the database
        db.dropTable(tableName);

        // Return the builder for chaining
        return this;
    }
}