package pt.up.fe.els2024.Table;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.ListOrderedMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Table class represents a table with rows and columns.
 */
public class Table {

        private List<Column> columns;
        private List<Row> rows;

        public Table(List<Column> columns){
            this.columns = columns;
            this.rows = new ArrayList<>();
        }

        public void addRow(Row row){
            rows.add(row);
        }

        public void addRow(Map<String, Object> values){
            Row row = new Row(values);
            rows.add(row);
        }

        public List<Row> getRows(){
            return rows;
        }

        public Column getColumn(String columnName){
            for(Column column : columns){
                if(column.getName().equals(columnName)){
                    return column;
                }
            }
            return null;
        }

        public void addColumn(Column column){
            columns.add(column);
        }

        public void addColumn(String name, Class<?> type, Object defaultValue, boolean nullable){
            Column column = new Column(name, type, defaultValue, nullable);
            columns.add(column);

            for (Row row : rows){
                row.setValue(name, defaultValue);
            }
        }

        public Table selectColumns(List<String> columnNames){
            List<Column> selectedColumns = new ArrayList<>();
            for (String name : columnNames){
                Column column = getColumn(name);
                if (column != null){
                    selectedColumns.add(column);
                }
            }

            Table newTable = new Table(selectedColumns);
            for (Row row : rows){
                Map<String, Object> values = new HashMap<>();
                for (String name : columnNames){
                    values.put(name, row.getValue(name));
                }
                newTable.addRow(values);
            }
            return newTable;
        }

        public Table filterdRows(Predicate<Row> condition) {
            Table filteredTable = new Table(columns);
            for (Row row : rows) {
                if (condition.evaluate(row)) {
                    filteredTable.addRow(row.getData());
                }
            }
            return filteredTable;
        }

}