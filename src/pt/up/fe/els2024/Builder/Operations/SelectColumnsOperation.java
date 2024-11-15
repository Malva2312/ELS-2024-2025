package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

/**
 * Represents an operation to select columns from a table.
 */
public class SelectColumnsOperation extends OperationBuilder {

    /**
     * Constructs a SelectColumnsOperation with the specified DataBaseBuilder.
     *
     * @param db the DataBaseBuilder instance
     */
    public SelectColumnsOperation(DataBaseBuilder db) {
        super(db);
    }

    private String[] columns;
    private String table;
    private String targetName;

    /**
     * Specifies the columns to be selected.
     *
     * @param columns the columns to select
     * @return the current SelectColumnsOperation instance
     */
    public SelectColumnsOperation select(String... columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Specifies the source table from which columns will be selected.
     *
     * @param table the source table name
     * @return the current SelectColumnsOperation instance
     */
    public SelectColumnsOperation fromTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Specifies the target table where the selected columns will be stored.
     *
     * @param targetName the target table name
     * @return the current SelectColumnsOperation instance
     */
    public SelectColumnsOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Executes the operation to select columns from the source table and store them in the target table.
     *
     * @return the current OperationBuilder instance
     * @throws IllegalArgumentException if columns, table, or target name are not specified or if the source table does not exist
     */
    @Override
    protected OperationBuilder executeOperation() {
        if (columns != null && table != null && targetName != null) {
            var table = db.getTable(this.table);
            if (table != null) {
                // if target table is null write on source table
                if (this.targetName == null) {
                    this.targetName = this.table;
                }
                var newTable = table.selectColumns(List.of(this.columns));
                db.addTable(this.targetName, newTable);
            } else {
                throw new IllegalArgumentException("Table " + this.table + " does not exist.");
            }
        } else {
            throw new IllegalArgumentException("Columns, table and target name must be specified.");
        }
        return this;
    }
}
