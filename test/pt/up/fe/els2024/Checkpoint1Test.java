package pt.up.fe.els2024;

import static org.junit.Assert.*;

import org.junit.Test;
import pt.up.fe.specs.util.SpecsIo;

public class Checkpoint1Test {
    @Test
    public void exampleTest() {
        // Reads a resource and tests contents
        assertEquals("Expected text", SpecsIo.getResource("pt/up/fe/els2024/resource.txt"));
    }

    @Test
    public void testTree(){
        // Run loadConfigs
    }

    @Test
    public void testParseCommands(){
        // Run parseCommands
        //File file = new File("test/pt/up/fe/els2024/config.yaml");
        //ConfigurationParser configurationParser = new ConfigurationParser(file);
        //try {
          //  configurationParser.parseCommands();
        //} catch (Exception e) {
          //  e.printStackTrace();
        //}
    }

}
