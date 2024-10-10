package pt.up.fe.els2024.Commands;

import java.io.FileNotFoundException;

public interface Command {
    void execute() throws FileNotFoundException;
}
