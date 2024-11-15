package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Column;

import javax.xml.crypto.Data;

public class RenameOperation extends OperationBuilder {

    private String tableName;
    private String originalName;
    private String newName;

    // Constructor for the RenameOperation
    public RenameOperation(DataBaseBuilder db) {
        super(db);
    }

    public RenameOperation table(String tableName) {
        this.tableName = tableName;
        return this;
    }

    public RenameOperation from(String originalName) {
        this.originalName = originalName;
        return this;
    }

    public RenameOperation to(String newName) {
        this.newName = newName;
        return this;
    }

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
