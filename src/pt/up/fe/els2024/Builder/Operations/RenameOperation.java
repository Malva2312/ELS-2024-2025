package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import javax.xml.crypto.Data;

/**
 * RenameOperation is a builder class for renaming columns in a table.
 */
public class RenameOperation extends OperationBuilder {

    private String tableName;
    private String originalName;
    private String newName;

    /**
     * Constructor for the RenameOperation.
     *
     * @param db the DataBaseBuilder instance
     */
    public RenameOperation(DataBaseBuilder db) {
        super(db);
    }

    /**
     * Sets the table name for the rename operation.
     *
     * @param tableName the name of the table
     * @return the current instance of RenameOperation
     */
    public RenameOperation table(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Sets the original column name for the rename operation.
     *
     * @param originalName the original name of the column
     * @return the current instance of RenameOperation
     */
    public RenameOperation from(String originalName) {
        this.originalName = originalName;
        return this;
    }

    /**
     * Sets the new column name for the rename operation.
     *
     * @param newName the new name of the column
     * @return the current instance of RenameOperation
     */
    public RenameOperation to(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * Executes the rename operation.
     *
     * @return the current instance of OperationBuilder
     * @throws IllegalArgumentException if the table or column does not exist
     */
    protected OperationBuilder executeOperation() {
        // Retrieve the table by name from the DataBaseBuilder
        Table table = db.getTable(tableName);

        if (table == null) {
            throw new IllegalArgumentException("Table '" + tableName + "' does not exist.");
        }

        // Find the column by its original name
        Column column = table.getColumn(originalName);
        if (column == null) {
            throw new IllegalArgumentException("Column '" + originalName + "' does not exist in table '" + tableName + "'.");
        }

        // Rename the column
        column.setName(newName);  // Assuming Column has a `setName()` method to rename it

        // Return the builder for chaining
        return this;
    }
}