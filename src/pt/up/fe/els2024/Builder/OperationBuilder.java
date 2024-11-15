package pt.up.fe.els2024.Builder;

import pt.up.fe.els2024.Builder.Operations.*;

public abstract class OperationBuilder {
    protected final DataBaseBuilder db;

    protected OperationBuilder(DataBaseBuilder db) {
        this.db = db;
    }

    protected abstract OperationBuilder executeOperation();

    protected DataBaseBuilder getBuilder() {
        return db;
    }

    public OperationBuilder end() {
        return executeOperation();
    }

    public LoadJSONOperation loadJSON() {
        executeOperation();
        return new LoadJSONOperation(getBuilder());
    }

    public LoadXMLOperation loadXML() {
        executeOperation();
        return new LoadXMLOperation(getBuilder());
    }

    public LoadYAMLOperation loadYAML() {
        executeOperation();
        return new LoadYAMLOperation(getBuilder());
    }

    public PrintAllOperation printAll() {
        executeOperation();
        return new PrintAllOperation(getBuilder());
    }

    public ArgMaxOperation selectMax() {
        executeOperation();
        return new ArgMaxOperation(getBuilder());
    }

    public ArgMinOperation selectMin() {
        executeOperation();
        return new ArgMinOperation(getBuilder());
    }

    public SelectColumnsOperation select() {
        executeOperation();
        return new SelectColumnsOperation(getBuilder());
    }

    public FilterOperation filter() {
        executeOperation();
        return new FilterOperation(getBuilder());
    }

    public ConcatHorizontalOperation concactHorizontal() {
        executeOperation();
        return new ConcatHorizontalOperation(getBuilder());
    }

    public SaveOperation save() {
        executeOperation();
        return new SaveOperation(getBuilder());
    }

    public RenameOperation rename() {
        executeOperation();
        return new RenameOperation(getBuilder());
    }

    public LimitOperation limit() {
        executeOperation();
        return new LimitOperation(getBuilder());
    }

    public DropOperation drop() {
        executeOperation();
        return new DropOperation(getBuilder());
    }

    public MaxTimePercentagePerFileOperation maxTimePercentagePerFile() {
        executeOperation();
        return new MaxTimePercentagePerFileOperation(getBuilder());
    }

}
