package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

/**
 * This class represents an operation that prints all tables in the database.
 */
public class PrintAllOperation extends OperationBuilder {

    /**
     * Constructs a PrintAllOperation with the specified DataBaseBuilder.
     *
     * @param db the DataBaseBuilder instance
     */
    public PrintAllOperation(DataBaseBuilder db) {
        super(db);
    }

    /**
     * Executes the operation to print all tables in the database.
     *
     * @return the current instance of OperationBuilder
     */
    @Override
    protected OperationBuilder executeOperation() {
        System.out.println("Printing all tables...");

        for (var entry : db.getTables().entrySet()) {
            System.out.println("Table: " + entry.getKey() + "\n");
            entry.getValue().printTable();
            System.out.println("______________________________");
        }
        return this;
    }
}
