package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

public class ConcatHorizontalOperation extends OperationBuilder {
    public ConcatHorizontalOperation(DataBaseBuilder db) {
        super(db);
    }

    private List<String> tablesToConcat;
    private String targetName;

    public ConcatHorizontalOperation onTables(String... tables) {
        this.tablesToConcat = List.of(tables);
        return this;
    }

    public ConcatHorizontalOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        if (tablesToConcat != null && targetName != null) {
            //concat iteratively
            var newTable = db.getTable(tablesToConcat.get(0));
            for (int i = 1; i < tablesToConcat.size(); i++) {
                newTable = newTable.concatHorizontal(db.getTable(tablesToConcat.get(i)));
            }
            db.addTable(this.targetName, newTable);
        } else {
            throw new IllegalArgumentException("Tables and target name must be specified.");
        }
        return this;
    }
}
