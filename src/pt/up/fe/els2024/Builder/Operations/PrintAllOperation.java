package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class PrintAllOperation extends OperationBuilder {
    public PrintAllOperation(DataBaseBuilder db) {
        super(db);
    }

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
