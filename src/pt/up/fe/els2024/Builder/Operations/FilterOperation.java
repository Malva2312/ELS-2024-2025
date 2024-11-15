package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class FilterOperation extends OperationBuilder {
    public FilterOperation(DataBaseBuilder db) {
        super(db);
    }

    private String column;
    private String table;
    private String targetName;
    private String condition;
    private String value;

    public FilterOperation onColumn(String column) {
        this.column = column;
        return this;
    }

    public FilterOperation onTable(String table) {
        this.table = table;
        return this;
    }

    public FilterOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

    public FilterOperation where(String condition, String value) {
        this.condition = condition;
        this.value = value;
        return this;
    }

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
