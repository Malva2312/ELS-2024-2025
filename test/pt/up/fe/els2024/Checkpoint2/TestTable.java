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
        if (table == null) {
            // Only initialize if table is null to maintain state across tests
            Column col1 = new Column("ID", Integer.class, 0, false);
            Column col2 = new Column("Name", String.class, "", false);
            table = new Table(Arrays.asList(col1, col2));
        }
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

        assertEquals(2, table.getRows().size());
        assertEquals("Bob", table.getRows().get(1).getValue("Name"));
    }

    @Test
    public void test3_SelectColumns() {
        // Add some rows for selection testing
        table.addRow(createRow(3, "Charlie"));

        List<String> columnsToSelect = List.of("ID");
        Table selectedTable = table.selectColumns(columnsToSelect);

        assertEquals(3, selectedTable.getRows().size());
        assertEquals(1, selectedTable.getRows().getFirst().getValue("ID"));
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
        Map<String, Object> updatedData = new HashMap<>();
        updatedData.put("FullName", "Alice Updated");
        table.updateRow(0, updatedData);

        Row row = table.getRows().getFirst();
        assertEquals("Alice Updated", row.getValue("FullName"));
    }

    @Test
    public void test7_DeleteRow() {
        table.deleteRow(1);  // Deletes the second row

        assertEquals(2, table.getRows().size());
        assertNull(table.getRows().stream().filter(r -> "Bob".equals(r.getValue("FullName"))).findFirst().orElse(null));
    }

    @Test
    public void test8_FilterRows() {
        table.addRow(createRow(4, "David"));
        table.addRow(createRow(5, "Eve"));

        Table filteredTable = table.filterdRows(row -> ((Integer) row.getValue("ID")) > 3);
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

    private Map<String, Object> createRow(int id, String name) {
        Map<String, Object> rowData = new HashMap<>();
        rowData.put("ID", id);
        rowData.put("Name", name);
        return rowData;
    }
}
