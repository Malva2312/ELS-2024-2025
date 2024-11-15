package pt.up.fe.els2024.Builder;
import pt.up.fe.els2024.Table.Table;

import org.apache.commons.collections4.map.ListOrderedMap;
import java.util.Map;

/**
 * Builder class for creating and managing database tables.
 */
public class DataBaseBuilder extends OperationBuilder {

    private final ListOrderedMap<String, Table> tables;

    /**
     * Constructs a new DataBaseBuilder.
     */
    public DataBaseBuilder() {
        super(null);
        this.tables = new ListOrderedMap<>();
    }

    /**
     * Returns the current instance of DataBaseBuilder.
     *
     * @return the current instance of DataBaseBuilder
     */
    @Override
    protected DataBaseBuilder getBuilder() {
        return this;
    }

    /**
     * Adds extracted data to a table.
     *
     * @param targetName the name of the target table
     * @param data the data to be added to the table
     */
    public void addExtractedData(String targetName, Map<String, String> data) {
        Table table = new Table();
        for (var entry : data.entrySet()) {
            table.addColumn(entry.getKey(), entry.getValue().getClass(), entry.getValue(), false);
        }
        tables.put(targetName, table);
    }

    /**
     * Adds a table to the builder.
     *
     * @param name the name of the table
     * @param table the table to be added
     */
    public void addTable(String name, Table table) {
        tables.put(name, table);
    }

    /**
     * Retrieves a table by its name.
     *
     * @param name the name of the table
     * @return the table with the specified name
     */
    public Table getTable(String name) {
        return tables.get(name);
    }

    /**
     * Retrieves all tables in the builder.
     *
     * @return a ListOrderedMap of all tables
     */
    public ListOrderedMap<String, Table> getTables() {
        return tables;
    }

    /**
     * Removes a table by its name.
     *
     * @param tableName the name of the table to be removed
     */
    public void dropTable(String tableName) {
        tables.remove(tableName);
    }

    /**
     * Executes the operation. Currently returns null.
     *
     * @return null
     */
    @Override
    protected OperationBuilder executeOperation() {
        return null;
    }

    private String currentFolder = "";

    /**
     * Sets the current folder.
     *
     * @param folder the folder to be set as current
     */
    public void setCurrentFolder(String folder) {
        this.currentFolder = folder;
    }

    /**
     * Sets the directory and returns the current instance of DataBaseBuilder.
     *
     * @param folder the folder to be set as directory
     * @return the current instance of DataBaseBuilder
     */
    public DataBaseBuilder setDirectory(String folder) {
        this.currentFolder = folder;
        return this;
    }

    /**
     * Resolves the path by combining the current folder and the file name.
     *
     * @param fileName the name of the file
     * @return the resolved path
     */
    public String resolvePath(String fileName) {
        return currentFolder + "/" + fileName;
    }
}
