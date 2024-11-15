package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

public class ProcessFoldersOperation extends OperationBuilder {
    private List<String> folders;
    private Runnable operationSequence;

    public ProcessFoldersOperation(DataBaseBuilder db) {
        super(db);
    }

    public ProcessFoldersOperation folders(String... folderPaths) {
        this.folders = List.of(folderPaths);
        return this;
    }

    public ProcessFoldersOperation operations(Runnable operationSequence) {
        this.operationSequence = operationSequence;
        return this;
    }

    @Override
    protected OperationBuilder executeOperation() {
        if (folders == null || folders.isEmpty()) {
            throw new IllegalStateException("No folders specified for processing.");
        }
        if (operationSequence == null) {
            throw new IllegalStateException("No operations defined for folder processing.");
        }

        for (String folder : folders) {
            System.out.println("Processing folder: " + folder);
            db.setCurrentFolder(folder); // Assume `DataBaseBuilder` allows setting the current folder
            operationSequence.run();
        }

        return this;
    }
}
