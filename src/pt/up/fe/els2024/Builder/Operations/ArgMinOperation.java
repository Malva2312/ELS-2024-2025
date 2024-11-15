package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Row;

import java.util.NoSuchElementException;

public class ArgMinOperation extends OperationBuilder {

    private String columnName;
    private Table resultTable;
    private String sourceTable;

    public ArgMinOperation(DataBaseBuilder db) {
        super(db);
    }

    public ArgMinOperation onColumn(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public ArgMinOperation onTable(String tableName) {
        this.resultTable = db.getTable(tableName);
        this.sourceTable = tableName;
        return this;
    }


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

        db.addTable(sourceTable , resultTable);


        return this;
    }

    public Table getResultTable() {
        if (resultTable == null) {
            throw new IllegalStateException("ArgMax operation has not been executed.");
        }
        return resultTable;
    }
}
