package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

/**
 * Represents a join operation between two tables.
 */
public class JoinOperation extends OperationBuilder {
    String table1;
    String table2;
    String targetTable;
    String targetColumn1;
    String targetColumn2;

    /**
     * Constructs a JoinOperation with the specified database and tables.
     *
     * @param db the database builder
     * @param table1 the first table to join
     * @param table2 the second table to join
     */
    public JoinOperation(DataBaseBuilder db, String table1, String table2) {
        super(db);
        this.table1 = table1;
        this.table2 = table2;
    }

    /**
     * Specifies the tables to join.
     *
     * @param table1 the first table to join
     * @param table2 the second table to join
     * @return the current JoinOperation instance
     */
    public JoinOperation on(String table1, String table2) {
        this.table1 = table1;
        this.table2 = table2;
        return this;
    }

    /**
     * Specifies the target table for the join result.
     *
     * @param table the target table
     * @return the current JoinOperation instance
     */
    public JoinOperation into(String table) {
        this.targetTable = table;
        return this;
    }

    /**
     * Executes the join operation.
     *
     * @return the current JoinOperation instance
     * @throws IllegalArgumentException if either of the tables do not exist
     */
    @Override
    protected OperationBuilder executeOperation() {
        var table1 = db.getTable(this.table1);
        var table2 = db.getTable(this.table2);

        if (table1 != null && table2 != null) {
            var joinedTable = table1.join(table2, this.targetColumn1, this.targetColumn2);
            db.addTable(this.targetTable, joinedTable);
        } else {
            throw new IllegalArgumentException("Tables " + this.table1 + " and " + this.table2 + " do not exist.");
        }

        return this;
    }
}
