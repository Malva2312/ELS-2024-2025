package pt.up.fe.els2024.Commands;

import java.io.FileNotFoundException;

/**
 * Represents a command that can be executed.
 */
public interface Command {
    /**
     * Executes the command.
     *
     * @throws FileNotFoundException if the file to be processed is not found.
     */
    void execute() throws FileNotFoundException;
}