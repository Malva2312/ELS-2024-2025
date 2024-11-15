package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;


/**
 * This class represents an operation to print a table from the database.
 */
public class PrintTableOperation extends OperationBuilder {

    /**
     * The name of the table to be printed.
     */
    private String table;

    /**
     * Constructs a new PrintTableOperation.
     *
     * @param db    the database builder
     * @param table the name of the table to be printed
     */
    public PrintTableOperation(DataBaseBuilder db, String table) {
        super(db);
        this.table = table;
    }

    /**
     * Executes the operation to print the specified table.
     *
     * @return the current instance of PrintTableOperation
     * @throws IllegalArgumentException if the table is not specified or does not exist
     */
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
