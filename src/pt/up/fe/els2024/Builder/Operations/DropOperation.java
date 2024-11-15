package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;

/**
 * Represents an operation to drop a table from the database.
 */
public class DropOperation extends OperationBuilder {

    private String tableName;

    /**
     * Constructor for the DropOperation.
     *
     * @param db the database builder instance
     */
    public DropOperation(DataBaseBuilder db) {
        super(db);
    }

    /**
     * Specifies the table to be dropped.
     *
     * @param tableName the name of the table to drop
     * @return the current DropOperation instance for chaining
     */
    public DropOperation table(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Executes the drop table operation.
     *
     * @return the current OperationBuilder instance for chaining
     * @throws IllegalArgumentException if the table does not exist
     */
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