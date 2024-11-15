package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

public class SelectColumnsOperation extends OperationBuilder {
    public SelectColumnsOperation(DataBaseBuilder db) {
        super(db);
    }

    private String[] columns;
    private String table;
    private String targetName;

    public SelectColumnsOperation select(String... columns) {
        this.columns = columns;
        return this;
    }

    public SelectColumnsOperation fromTable(String table) {
        this.table = table;
        return this;
    }

    public SelectColumnsOperation toTable(String targetName) {
        this.targetName = targetName;
        return this;
    }

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
