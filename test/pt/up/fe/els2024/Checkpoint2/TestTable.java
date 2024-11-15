package pt.up.fe.els2024.Checkpoint2;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pt.up.fe.els2024.Table.Column;
import pt.up.fe.els2024.Table.Row;
import pt.up.fe.els2024.Table.Table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)  // Ensures tests run in order by name
public class TestTable {

    private static Table table;  // Static table shared by all tests

    @Before
    public void setUp() {
        table = new Table(Arrays.asList(
                new Column("ID", Integer.class, 0, false),
                new Column("Name", String.class, "", false)
        ));
    }

    @Test
    public void test1_AddRowWithMap() {
        Map<String, Object> rowData = new HashMap<>();
        rowData.put("ID", 1);
        rowData.put("Name", "Alice");

        table.addRow(rowData);

        Row row = table.getRows().getFirst();
        assertNotNull(row);
        assertEquals(1, row.getValue("ID"));
        assertEquals("Alice", row.getValue("Name"));
    }

    @Test
    public void test2_AddRowWithRowObject() {
        Map<String, Object> rowData = new HashMap<>();
        rowData.put("ID", 2);
        rowData.put("Name", "Bob");

        Row row = new Row(rowData);
        table.addRow(row);

        assertEquals(1, table.getRows().size());
        assertEquals("Bob", table.getRows().get(0).getValue("Name"));
    }

    @Test
    public void test3_SelectColumns() {
        table.addRow(createRow(3, "Charlie"));

        List<String> columnsToSelect = List.of("ID");
        Table selectedTable = table.selectColumns(columnsToSelect);

        assertEquals(1, selectedTable.getRows().size());  // Only one row was added
        assertEquals(3, selectedTable.getRows().getFirst().getValue("ID"));
        assertNull(selectedTable.getRows().getFirst().getValue("Name"));
    }


    @Test
    public void test4_RenameColumn() {
        table.renameColumn("Name", "FullName");

        Column renamedColumn = table.getColumn("FullName");
        assertNotNull(renamedColumn);
        assertEquals("FullName", renamedColumn.getName());
    }

    @Test
    public void test5_AddColumn() {
        table.addColumn("Age", Integer.class, 0, true);

        Column newColumn = table.getColumn("Age");
        assertNotNull(newColumn);
        assertEquals("Age", newColumn.getName());
        assertEquals(Integer.class, newColumn.getType());
    }

    @Test
    public void test6_UpdateRow() {
        // First, add a row to the table
        Map<String, Object> rowData = new HashMap<>();
        rowData.put("ID", 1);
        rowData.put("Name", "Alice");

        Row row = new Row(rowData);
        table.addRow(row);

        Map<String, Object> updatedData = new HashMap<>();
        updatedData.put("Name", "Alice Updated");  // Updating the "Name" column

        table.updateRow(0, updatedData);

        Row updatedRow = table.getRows().getFirst();
        assertEquals("Alice Updated", updatedRow.getValue("Name"));
    }


    @Test
    public void test7_DeleteRow() {
        // Add two rows to the table before attempting to delete
        table.addRow(createRow(1, "Alice"));
        table.addRow(createRow(2, "Bob"));

        table.deleteRow(1);

        assertEquals(1, table.getRows().size());
        assertNull(table.getRows().stream().filter(r -> "Bob".equals(r.getValue("Name"))).findFirst().orElse(null));
        // row with "Alice" still exists
        assertNotNull(table.getRows().stream().filter(r -> "Alice".equals(r.getValue("Name"))).findFirst().orElse(null));
    }

    @Test
    public void test8_FilterRows() {
        table.addRow(createRow(4, "David"));
        table.addRow(createRow(5, "Eve"));

        Table filteredTable = table.filterRows(row -> ((Integer) row.getValue("ID")) > 3);
        assertEquals(2, filteredTable.getRows().size());
        assertEquals("David", filteredTable.getRows().get(0).getValue("Name"));
        assertEquals("Eve", filteredTable.getRows().get(1).getValue("Name"));
    }

    @Test
    public void test9_AddRowWithInvalidType() {
        Map<String, Object> invalidRowData = new HashMap<>();
        invalidRowData.put("ID", "InvalidType");  // String instead of Integer

        boolean exceptionThrown = false;
        try {
            table.addRow(invalidRowData);  // Try to add row with invalid type
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;  // Set flag if exception is caught
        }

        assertTrue("IllegalArgumentException should be thrown for invalid data type", exceptionThrown);
    }

    @Test
    public void test10_DeleteNonExistingRow() {
        boolean exceptionThrown = false;
        try {
            table.deleteRow(100);  // Try to delete row at an invalid index
        } catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;  // Set flag if exception is caught
        }

        assertTrue("IndexOutOfBoundsException should be thrown for non-existing row", exceptionThrown);
    }
    @Test
    public void test11_FilterRowsByCondition() {
        table.addRow(createRow(6, "Alice"));
        table.addRow(createRow(7, "Bob"));
        table.addRow(createRow(8, "Charlie"));

        // Filter rows where ID > 6
        Table filteredTable = table.filterRows(row -> ((Integer) row.getValue("ID")) > 6);

        assertEquals(2, filteredTable.getRows().size());  // Two rows should be returned (ID 7, 8)
        assertEquals("Bob", filteredTable.getRows().get(0).getValue("Name"));
        assertEquals("Charlie", filteredTable.getRows().get(1).getValue("Name"));
    }

    @Test
    public void test12_SearchRowsByColumnValue() {
        table.addRow(createRow(9, "David"));
        table.addRow(createRow(10, "Eve"));
        table.addRow(createRow(11, "Alice"));

        // Search for rows where Name = "Eve"
        Table searchResult = table.searchRows("Name", "Eve");

        assertEquals(1, searchResult.getRows().size());  // Only one row with Name = "Eve"
        assertEquals("Eve", searchResult.getRows().get(0).getValue("Name"));
    }

    @Test
    public void test13_SearchRowsByNonExistingValue() {
        table.addRow(createRow(12, "George"));
        table.addRow(createRow(13, "Hannah"));

        // Search for rows where Name = "Zoe" (non-existing)
        Table searchResult = table.searchRows("Name", "Zoe");

        assertEquals(0, searchResult.getRows().size());  // No rows should match
    }

    @Test
    public void test14_SortRowsByColumnAscending() {
        table.addRow(createRow(14, "Alice"));
        table.addRow(createRow(15, "Bob"));
        table.addRow(createRow(16, "Charlie"));

        // Sort by ID in ascending order
        Table sortedTable = table.sortRows("ID", true);

        assertEquals(3, sortedTable.getRows().size());
        assertEquals("Alice", sortedTable.getRows().get(0).getValue("Name"));
        assertEquals("Bob", sortedTable.getRows().get(1).getValue("Name"));
        assertEquals("Charlie", sortedTable.getRows().get(2).getValue("Name"));
    }

    @Test
    public void test15_SortRowsByColumnDescending() {
        table.addRow(createRow(17, "Alice"));
        table.addRow(createRow(18, "Bob"));
        table.addRow(createRow(19, "Charlie"));

        // Sort by ID in descending order
        Table sortedTable = table.sortRows("ID", false);

        assertEquals(3, sortedTable.getRows().size());
        assertEquals("Charlie", sortedTable.getRows().get(0).getValue("Name"));
        assertEquals("Bob", sortedTable.getRows().get(1).getValue("Name"));
        assertEquals("Alice", sortedTable.getRows().get(2).getValue("Name"));
    }

    private Map<String, Object> createRow(int id, String name) {
        Map<String, Object> rowData = new HashMap<>();
        rowData.put("ID", id);
        rowData.put("Name", name);
        return rowData;
    }
}
