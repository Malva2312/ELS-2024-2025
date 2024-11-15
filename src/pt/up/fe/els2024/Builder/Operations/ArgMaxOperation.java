package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;
import pt.up.fe.els2024.Table.Table;
import pt.up.fe.els2024.Table.Row;

import java.util.NoSuchElementException;

public class ArgMaxOperation extends OperationBuilder {

    private String columnName;
    private Table resultTable;
    private String sourceTable;
    private String targetName;

    public ArgMaxOperation(DataBaseBuilder db) {
        super(db);
    }

    public ArgMaxOperation onColumn(String columnName) {
        this.columnName = columnName;
        return this;
    }

    public ArgMaxOperation onTable(String tableName) {
        this.resultTable = db.getTable(tableName);
        this.sourceTable = tableName;
        return this;
    }

    public ArgMaxOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }


    @Override
    protected OperationBuilder executeOperation() {

        if (this.resultTable == null) {
            throw new IllegalStateException("No table available for ArgMax operation.");
        }

        Row maxRow = null;
        Comparable<Object> maxValue = null;

        for (Row row : resultTable.getRows()) {
            Object value = row.getValue(columnName);
            if (value instanceof Comparable) {
                @SuppressWarnings("unchecked")
                Comparable<Object> comparableValue = (Comparable<Object>) value;
                if (maxValue == null || comparableValue.compareTo(maxValue) > 0) {
                    maxValue = comparableValue;
                    maxRow = row;
                }
            } else {
                throw new IllegalArgumentException("Column " + columnName + " contains non-comparable values.");
            }
        }

        if (maxRow == null) {
            throw new NoSuchElementException("No rows found with a valid value in column " + columnName);
        }

        resultTable = new Table(resultTable.getColumns());
        resultTable.addRow(maxRow.getData());

        if (targetName != null) {
            db.addTable(targetName, resultTable);
        } else {
            db.addTable(sourceTable , resultTable);
        }


        return this;
    }

    public Table getResultTable() {
        if (resultTable == null) {
            throw new IllegalStateException("ArgMax operation has not been executed.");
        }
        return resultTable;
    }
}
