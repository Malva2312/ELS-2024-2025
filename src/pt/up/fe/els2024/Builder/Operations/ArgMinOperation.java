package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Row;

import java.util.NoSuchElementException;

/**
 * ArgMinOperation class performs the ArgMin operation on a specified column of a table.
 */
public class ArgMinOperation extends OperationBuilder {

    private String columnName;
    private Table resultTable;
    private String sourceTable;
    private String targetName;

    /**
     * Constructor for ArgMinOperation.
     *
     * @param db the DataBaseBuilder instance
     */
    public ArgMinOperation(DataBaseBuilder db) {
        super(db);
    }

    /**
     * Specifies the column on which to perform the ArgMin operation.
     *
     * @param columnName the name of the column
     * @return the current ArgMinOperation instance
     */
    public ArgMinOperation onColumn(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * Specifies the table on which to perform the ArgMin operation.
     *
     * @param tableName the name of the table
     * @return the current ArgMinOperation instance
     */
    public ArgMinOperation onTable(String tableName) {
        this.resultTable = db.getTable(tableName);
        this.sourceTable = tableName;
        return this;
    }

    /**
     * Specifies the target table to store the result of the ArgMin operation.
     *
     * @param targetName the name of the target table
     * @return the current ArgMinOperation instance
     */
    public ArgMinOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * Executes the ArgMin operation.
     *
     * @return the current ArgMinOperation instance
     * @throws IllegalStateException if no table is available for the operation
     * @throws IllegalArgumentException if the column contains non-comparable values
     * @throws NoSuchElementException if no rows are found with a valid value in the column
     */
    @Override
    protected OperationBuilder executeOperation() {

        if (this.resultTable == null) {
            throw new IllegalStateException("No table available for ArgMax operation.");
        }

        Row minRow = null;
        Comparable<Object> minValue = null;

        for (Row row : resultTable.getRows()) {
            Object value = row.getValue(columnName);
            if (value instanceof Comparable) {
                @SuppressWarnings("unchecked")
                Comparable<Object> comparableValue = (Comparable<Object>) value;
                if (minValue == null || comparableValue.compareTo(minValue) < 0) {
                    minValue = comparableValue;
                    minRow = row;
                }
            } else {
                throw new IllegalArgumentException("Column " + columnName + " contains non-comparable values.");
            }
        }

        if (minRow == null) {
            throw new NoSuchElementException("No rows found with a valid value in column " + columnName);
        }

        resultTable = new Table(resultTable.getColumns());
        resultTable.addRow(minRow.getData());

        if (targetName != null) {
            db.addTable(targetName, resultTable);
        } else {
            db.addTable(sourceTable , resultTable);
        }

        return this;
    }

    /**
     * Returns the result table of the ArgMin operation.
     *
     * @return the result table
     * @throws IllegalStateException if the ArgMin operation has not been executed
     */
    public Table getResultTable() {
        if (resultTable == null) {
            throw new IllegalStateException("ArgMax operation has not been executed.");
        }
        return resultTable;
    }
}