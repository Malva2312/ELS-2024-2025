package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;

/**
 * Represents an operation to limit the number of rows in a table.
 */
public class LimitOperation extends OperationBuilder {

    private String tableName;
    private int from;
    private int to;

    /**
     * Constructor for the LimitOperation.
     *
     * @param db the DataBaseBuilder instance
     */
    public LimitOperation(DataBaseBuilder db) {
        super(db);
    }

    /**
     * Specifies the table on which the limit will be applied.
     *
     * @param tableName the name of the table
     * @return the current LimitOperation instance
     */
    public LimitOperation table(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * Specifies the starting index of the limit.
     *
     * @param from the starting index
     * @return the current LimitOperation instance
     */
    public LimitOperation from(int from) {
        this.from = from;
        return this;
    }

    /**
     * Specifies the ending index of the limit.
     *
     * @param to the ending index
     * @return the current LimitOperation instance
     */
    public LimitOperation to(int to) {
        this.to = to;
        return this;
    }

    /**
     * Executes the limit operation on the specified table.
     *
     * @return the current OperationBuilder instance
     * @throws IllegalArgumentException if the table does not exist or the range is invalid
     */
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
