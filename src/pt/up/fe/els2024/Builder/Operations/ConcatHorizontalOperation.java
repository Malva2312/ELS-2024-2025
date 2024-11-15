package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

/**
 * Class representing an operation to concatenate tables horizontally.
 */
public class ConcatHorizontalOperation extends OperationBuilder {

    /**
     * Constructor for ConcatHorizontalOperation.
     *
     * @param db The DataBaseBuilder instance.
     */
    public ConcatHorizontalOperation(DataBaseBuilder db) {
        super(db);
    }

    private List<String> tablesToConcat;
    private String targetName;

    /**
     * Specifies the tables to concatenate.
     *
     * @param tables The names of the tables to concatenate.
     * @return The current instance of ConcatHorizontalOperation.
     */
    public ConcatHorizontalOperation onTables(String... tables) {
        this.tablesToConcat = List.of(tables);
        return this;
    }

    /**
     * Specifies the target table name where the result will be stored.
     *
     * @param targetName The name of the target table.
     * @return The current instance of ConcatHorizontalOperation.
     */
    public ConcatHorizontalOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Executes the concatenation operation.
     *
     * @return The current instance of ConcatHorizontalOperation.
     * @throws IllegalArgumentException if tables or target name are not specified.
     */
    @Override
    protected OperationBuilder executeOperation() {
        if (tablesToConcat != null && targetName != null) {
            // Concatenate tables iteratively
            var newTable = db.getTable(tablesToConcat.get(0));
            for (int i = 1; i < tablesToConcat.size(); i++) {
                newTable = newTable.concatHorizontal(db.getTable(tablesToConcat.get(i)));
            }
            // If table already exists, try to insert in the existing table
            if (db.getTable(targetName) != null) {
                db.getTable(targetName).insert(newTable);
            } else {
                db.addTable(targetName, newTable);
            }
        } else {
            throw new IllegalArgumentException("Tables and target name must be specified.");
        }
        return this;
    }
}
