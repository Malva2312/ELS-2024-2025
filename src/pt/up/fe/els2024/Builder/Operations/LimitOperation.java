package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;

public class LimitOperation extends OperationBuilder {

    private String tableName;
    private int from;
    private int to;

    // Constructor for the LimitOperation
    public LimitOperation(DataBaseBuilder db) {
        super(db);
    }

    // Method to specify the table on which the limit will be applied
    public LimitOperation table(String tableName) {
        this.tableName = tableName;
        return this;
    }

    // Method to specify the starting index of the limit
    public LimitOperation from(int from) {
        this.from = from;
        return this;
    }

    // Method to specify the ending index of the limit
    public LimitOperation to(int to) {
        this.to = to;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        // Retrieve the table by name from the DataBaseBuilder
        Table table = db.getTable(tableName);
        if (table == null) {
            throw new IllegalArgumentException("Table '" + tableName + "' does not exist.");
        }

        // Validate the range
        if (from < 0 || to < from) {
            throw new IllegalArgumentException("Invalid range: 'from' should be >= 0 and 'to' should be >= 'from'.");
        }

        // Apply the limit operation on the table (this assumes Table has a method to apply limits)
        table.limit(from, to);

        // Return the builder for chaining
        return this;
    }
}
