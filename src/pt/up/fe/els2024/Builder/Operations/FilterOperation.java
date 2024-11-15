package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
/**
 * Represents a filter operation to be performed on a database.
 */
public class FilterOperation extends OperationBuilder {

    /**
     * Constructs a FilterOperation with the specified DataBaseBuilder.
     *
     * @param db the DataBaseBuilder to be used
     */
    public FilterOperation(DataBaseBuilder db) {
        super(db);
    }

    private String column;
    private String table;
    private String targetName;
    private String condition;
    private String value;

    /**
     * Specifies the column to be filtered.
     *
     * @param column the column name
     * @return the current FilterOperation instance
     */
    public FilterOperation onColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * Specifies the table to be filtered.
     *
     * @param table the table name
     * @return the current FilterOperation instance
     */
    public FilterOperation onTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Specifies the target table where the filtered results will be stored.
     *
     * @param targetName the target table name
     * @return the current FilterOperation instance
     */
    public FilterOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Specifies the condition and value for the filter operation.
     *
     * @param condition the filter condition
     * @param value the value to be filtered
     * @return the current FilterOperation instance
     */
    public FilterOperation where(String condition, String value) {
        this.condition = condition;
        this.value = value;
        return this;
    }

    /**
     * Executes the filter operation on the specified table and stores the result in the target table.
     *
     * @return the current FilterOperation instance
     * @throws IllegalArgumentException if any required field is not specified or if the table does not exist
     */
    @Override
    protected OperationBuilder executeOperation() {
        if (column != null && table != null && targetName != null && condition != null) {
            var table = db.getTable(this.table);
            if (table != null) {
                // if target table is null write on source table
                if (this.targetName == null) {
                    this.targetName = this.table;
                }
                var newTable = table.filter(this.column, this.condition, this.value);
                db.addTable(this.targetName, newTable);
            } else {
                throw new IllegalArgumentException("Table " + this.table + " does not exist.");
            }
        } else {
            throw new IllegalArgumentException("Column, table, target name and condition must be specified.");
        }
        return this;
    }
}
