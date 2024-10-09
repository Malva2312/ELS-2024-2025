package pt.up.fe.els2024;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class Parse{

    public void main(String a) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        System.out.printf("INSIDE PARSE\n");
        //InputStream input = this.getClass().getClassLoader().getResourceAsStream("assignment1Files/decision_tree_1.yaml");
        InputStream inputStream = new FileInputStream(new File(a));
        System.out.printf("AFTER INPUTSTREAM\n");
        YamlConfig data = yaml.load(inputStream);
        System.out.printf("AFTER YAMLCONFIG\n");
        System.out.println( data );
        System.out.println( yaml.dump( data ));
    }
}