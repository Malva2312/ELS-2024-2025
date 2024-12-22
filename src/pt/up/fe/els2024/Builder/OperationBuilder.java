package pt.up.fe.els2024.Builder;

import pt.up.fe.els2024.Builder.Operations.*;

/**
 * Abstract class representing a builder for various operations.
 */
public abstract class OperationBuilder {
    protected final DataBaseBuilder db;

    /**
     * Constructor for OperationBuilder.
     *
     * @param db the DataBaseBuilder instance
     */
    protected OperationBuilder(DataBaseBuilder db) {
        this.db = db;
    }

    /**
     * Executes the operation.
     *
     * @return the current OperationBuilder instance
     */
    protected abstract OperationBuilder executeOperation();

    /**
     * Gets the DataBaseBuilder instance.
     *
     * @return the DataBaseBuilder instance
     */
    protected DataBaseBuilder getBuilder() {
        return db;
    }

    /**
     * Ends the current operation.
     *
     * @return the current OperationBuilder instance
     */
    public OperationBuilder end() {
        return executeOperation();
    }

    /**
     * Loads a JSON operation.
     *
     * @return a new LoadJSONOperation instance
     */
    public LoadJSONOperation loadJSON() {
        executeOperation();
        return new LoadJSONOperation(getBuilder());
    }

    /**
     * Loads an XML operation.
     *
     * @return a new LoadXMLOperation instance
     */
    public LoadXMLOperation loadXML() {
        executeOperation();
        return new LoadXMLOperation(getBuilder());
    }

    /**
     * Loads a YAML operation.
     *
     * @return a new LoadYAMLOperation instance
     */
    public LoadYAMLOperation loadYAML() {
        executeOperation();
        return new LoadYAMLOperation(getBuilder());
    }

    /**
     * Prints all data.
     *
     * @return a new PrintAllOperation instance
     */
    public PrintAllOperation printAll() {
        executeOperation();
        return new PrintAllOperation(getBuilder());
    }

    /**
     * Selects the maximum value.
     *
     * @return a new ArgMaxOperation instance
     */
    public ArgMaxOperation selectMax() {
        executeOperation();
        return new ArgMaxOperation(getBuilder());
    }

    /**
     * Selects the minimum value.
     *
     * @return a new ArgMinOperation instance
     */
    public ArgMinOperation selectMin() {
        executeOperation();
        return new ArgMinOperation(getBuilder());
    }

    /**
     * Selects columns.
     *
     * @return a new SelectColumnsOperation instance
     */
    public SelectColumnsOperation select() {
        executeOperation();
        return new SelectColumnsOperation(getBuilder());
    }

    /**
     * Filters data.
     *
     * @return a new FilterOperation instance
     */
    public FilterOperation filter() {
        executeOperation();
        return new FilterOperation(getBuilder());
    }

    /**
     * Concatenates data horizontally.
     *
     * @return a new ConcatHorizontalOperation instance
     */
    public ConcatHorizontalOperation concatHorizontal() {
        executeOperation();
        return new ConcatHorizontalOperation(getBuilder());
    }

    /**
     * Saves data.
     *
     * @return a new SaveOperation instance
     */
    public SaveOperation save() {
        executeOperation();
        return new SaveOperation(getBuilder());
    }

    /**
     * Renames data.
     *
     * @return a new RenameOperation instance
     */
    public RenameOperation rename() {
        executeOperation();
        return new RenameOperation(getBuilder());
    }

    /**
     * Limits data.
     *
     * @return a new LimitOperation instance
     */
    public LimitOperation limit() {
        executeOperation();
        return new LimitOperation(getBuilder());
    }

    /**
     * Drops data.
     *
     * @return a new DropOperation instance
     */
    public DropOperation drop() {
        executeOperation();
        return new DropOperation(getBuilder());
    }

    /**
     * Prints a specific table.
     *
     * @param table the name of the table to print
     * @return a new PrintTableOperation instance
     */
    public PrintTableOperation printTable(String table) {
        executeOperation();
        return new PrintTableOperation(getBuilder(), table);
    }

    /**
     * Processes folders.
     *
     * @return a new ProcessFoldersOperation instance
     */
    public ProcessFoldersOperation processFolders() {
        executeOperation();
        return new ProcessFoldersOperation(getBuilder());
    }

    /**
     * Joins two tables.
     *
     * @param table1 the name of the first table
     * @param table2 the name of the second table
     * @return a new JoinOperation instance
     */
    public JoinOperation joinTables(String table1, String table2) {
        executeOperation();
        return new JoinOperation(getBuilder(), table1, table2);
    }
}