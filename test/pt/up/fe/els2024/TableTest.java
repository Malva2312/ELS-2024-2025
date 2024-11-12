package pt.up.fe.els2024;

import static org.junit.Assert.*;

import org.junit.Test;
import pt.up.fe.els2024.Table.Table;

import java.util.Arrays;
import java.util.List;


public class TableTest {

    @Test
    public void testAddColumn() {
        Table table = new Table();
        table.addColumn("Column1", Arrays.asList("value1", "value2"));

        List<String> column = table.getColumn("Column1");
        assertEquals(Arrays.asList("value1", "value2"), column);
    }

    @Test
    public void testRenameColumn() {
        Table table = new Table();
        table.addColumn("oldName", Arrays.asList("value1", "value2"));
        table.renameColumn("oldName", "newName");

        List<String> column = table.getColumn("newName");
        assertEquals(Arrays.asList("value1", "value2"), column);
    }

    @Test
    public void testGetNumberOfRows() {
        Table table = new Table();
        table.addColumn("Column1", Arrays.asList("value1", "value2"));

        int numberOfRows = Table.getNumberOfRows(table);
        assertEquals(2, numberOfRows);
    }
}