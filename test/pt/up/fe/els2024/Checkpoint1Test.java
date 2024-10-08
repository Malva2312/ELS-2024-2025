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

}
