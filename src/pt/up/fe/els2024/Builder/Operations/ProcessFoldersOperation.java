package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

import java.util.List;

/**
 * Class representing an operation to process folders.
 */
public class ProcessFoldersOperation extends OperationBuilder {
    private List<String> folders;
    private Runnable operationSequence;

    /**
     * Constructs a ProcessFoldersOperation with the specified DataBaseBuilder.
     *
     * @param db the DataBaseBuilder instance
     */
    public ProcessFoldersOperation(DataBaseBuilder db) {
        super(db);
    }

    /**
     * Sets the folders to be processed.
     *
     * @param folderPaths the paths of the folders to be processed
     * @return the current instance of ProcessFoldersOperation
     */
    public ProcessFoldersOperation folders(String... folderPaths) {
        this.folders = List.of(folderPaths);
        return this;
    }

    /**
     * Sets the operations to be executed for each folder.
     *
     * @param operationSequence the sequence of operations to be executed
     * @return the current instance of ProcessFoldersOperation
     */
    public ProcessFoldersOperation operations(Runnable operationSequence) {
        this.operationSequence = operationSequence;
        return this;
    }

    /**
     * Executes the folder processing operation.
     *
     * @return the current instance of ProcessFoldersOperation
     * @throws IllegalStateException if no folders or operations are specified
     */
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
