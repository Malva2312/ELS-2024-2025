package pt.up.fe.els2024.Checkpoint1;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import pt.up.fe.els2024.Commands.Command;
import pt.up.fe.els2024.ConfigurationParser;

import java.io.FileNotFoundException;
import java.util.List;

public class Checkpoint1Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testParseCommands() throws FileNotFoundException {
        ConfigurationParser parser = new ConfigurationParser("test/pt/up/fe/els2024/Checkpoint1/config.yaml");
        List<Command> commands = parser.parseCommands();
        assertEquals(3, commands.size());
    }

    @Test
    public void parseCommandsFileNotFoundThrowsException() throws FileNotFoundException {
        ConfigurationParser parser = new ConfigurationParser("nonexistent.yaml");
        thrown.expect(FileNotFoundException.class);
        parser.parseCommands();
    }

    @Test
    public void parseCommandsHandlesEmptyFile() throws FileNotFoundException {
        ConfigurationParser parser = new ConfigurationParser("test/pt/up/fe/els2024/Checkpoint1/empty.yaml");
        List<Command> commands = parser.parseCommands();
        assertTrue(commands.isEmpty());
    }

    @Test
    public void parseCommandsHandlesInvalidYaml() throws FileNotFoundException {
        ConfigurationParser parser = new ConfigurationParser("test/pt/up/fe/els2024/Checkpoint1/invalid.yaml");
        thrown.expect(RuntimeException.class);
        parser.parseCommands();
    }
}