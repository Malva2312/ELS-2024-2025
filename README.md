# ELS Project

For this project, you need to [install Gradle](https://gradle.org/install/)

## Project setup

Copy your source files to the ``src`` folder, and your JUnit test files to the ``test`` folder.

## Compile and Running

To compile and install the program, run ``gradle installDist``. This will compile your classes and create a launcher script in the folder ``build/install/els2024-<GROUP>/bin``. For convenience, there are two script files, one for Windows (``els2024-<GROUP>.bat``) and another for Linux (``els2024-<GROUP>``), in the root of the repository, that call these scripts.

After compilation, tests will be automatically executed, if any test fails, the build stops. If you want to ignore the tests and build the program even if some tests fail, execute Gradle with flags "-x test".

When creating a Java executable, it is necessary to specify which class that contains a ``main()`` method should be entry point of the application. This can be configured in the Gradle script with the property ``mainClassName``, which by default has the value ``pt.up.fe.els2024.Main``.

## Test

To test the program, run ``gradle test``. This will execute the build, and run the JUnit tests in the ``test`` folder. If you want to see output printed during the tests, use the flag ``-i`` (i.e., ``gradle test -i``).
You can also see a test report by opening ``build/reports/tests/test/index.html``.

---
# Checkpoint 1

## Running the program
To run the program, use the following command:
- On Linux: ``./gradlew run --args "./input/config.yaml"``- On Linux: ``./gradlew run --args "./input/config.yaml"``
- On Windows: ``.\gradlew.bat run --args "./input/config.yaml"``.
This will run the Main class with the provided configuration file as an argument.

## Implemented Features
This project includes the following features:
- **Load Command**: Extracts data from files and loads it into tables.
- **Rename Command**: Renames columns in the tables.
- **Save Command**: Exports table data to a CSV file.
- **Configuration Parsing**: Parses YAML configuration files to execute a series of commands.

## Semantic Model
- Represents tables (Table) and commands (Command) for file/table operations.
- Configuration files parsed by ConfigurationParser.

### Table Representation
The `Table` class represents a table with columns and rows. It provides methods to add columns, add rows, and rename columns. The table data can be manipulated through various commands.

### Commands
Commands are actions that can be performed on tables. Each command implements the `Command` interface and provides an `execute` method. The following commands are implemented:

- **Load Command**: Loads data from specified files into a table.
- **Rename Command**: Renames columns in a table based on a provided mapping.
- **Save Command**: Saves the table data to a specified CSV file.

## YAML Documentation
The project uses YAML configuration files to define a sequence of commands to be executed. The `ConfigurationParser` class reads the YAML file and creates the corresponding command objects.

### Load Command
The `load` command extracts data from specified files and loads it into a table.
#### YAML Syntax
```yaml
- Load:
    files: 
      - "path/to/file1.yaml"
      - "path/to/file2.yaml"
    as: "table_name"
```

### Save Command
The save command exports table data to a specified CSV file.
#### YAML Syntax
```yaml
- save:
    table: "table_name"
    columns: ["Column1", "Column2", "Column3"]
    file: "path/to/output.csv"
```

### Rename Command
The rename command renames columns in a table based on a provided mapping.
#### YAML Syntax
```yaml
- rename:
    table: "table_name"
    columns:
    - old_name: "New Name"
    - another_old_name: "Another New Name"
```


### Example YAML
```yaml
- load:
  files:
  - "assignment1Files/decision_tree_1.yaml"
  - "assignment1Files/decision_tree_2.yaml"
  as: "some_table"

- rename:
  table: "some_table"
  columns:
  - classes_: "Classes"
  - splitter: "Splitter"
  - ccp_alpha: "CPP Alpha"
  - min_samples_split: "Min Samples Split"

- save:
  table: "some_table"
  columns: ["Criterion", "Splitter", "CPP Alpha", "Min Samples Split"]
  out: "resources/configurationFile.csv"
```

## Configuration File
The configuration file is a YAML file that defines a sequence of commands to be executed. Each command is specified with its type and parameters. The `ConfigurationParser` class reads this file and creates the corresponding command objects to be executed.
The decision to use a YAML configuration file was made for the following reasons:

1. **Readability**: YAML is human-readable and easy to understand, making it simple for users to define and modify configurations.
2. **Structure**: YAML supports complex data structures, which allows for a clear and organized representation of commands and their parameters.
3. **Flexibility**: YAML's flexible syntax allows for the inclusion of various types of data, such as lists and maps, which are essential for defining commands with multiple parameters.

---
# Checkpoint 2

## Running the program
To run the program, use the following command:
- On Linux: ``./gradlew run "``- On Linux: ``./gradlew run"``
- On Windows: ``.\gradlew.bat run``.
  This will run the Main class with no arguments since we discarded the configuration file.

## Builder Package and DSL Implementation
The Builder package implements a internal DSL for constructing and executing operations on tables.
The Main class demonstrates how to use this DSL to perform various operations and obtain the result needed for this assignment.

## Example Usage in Main Class
The Main class demonstrates the use of the DSL to perform the basic operations required for this assignment.
The following operations are executed:
```java
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
    .from("assignment2Files/run1/profiling.json")
    .into("time")
    .withAttributes("time%", "seconds", "name")
    .nestedIn("functions")

    .loadXML()
    .from("assignment2Files/run1/vitis-report.xml")
    .into("vitis")
    .nestedIn("Device", "Resources")

    .loadYAML()
    .from("assignment2Files/run1/decision_tree.yaml")
    .into("decision_tree")

    .loadYAML()
    .from("assignment2Files/run1/decision_tree.yaml")
    .into("decision_tree2")
    .nestedIn("params")

    .selectMax()
    .onColumn("time%")
    .onTable("time")

    .concactHorizontal()
    .toTable("final")
    .onTables("decision_tree", "decision_tree2", "time", "vitis")

    .save()
    .tables("final")
    .to("assignment2Files/output.html")
    .as("html")

    .end();
```

Alternatively, it is possible to encapsulate part of the process to repeat for each folder being analyzed.
`processFolders()` method allows to specify a list of folders to process and a sequence of operations to be executed for each folder.

```java
db
    .processFolders()
    .folders("assignment2Files/run1", "assignment2Files/run2", "assignment2Files/run3") // Specify folders
    .operations(() -> { // Define reusable operation sequence
        db
                .loadJSON()
                .from("profiling.json")
                .into("time")
                .withAttributes("time%", "seconds", "name")
                .nestedIn("functions")

                .loadXML()
                .from("vitis-report.xml")
                .into("vitis")
                .nestedIn("Device", "Resources")

                .loadYAML()
                .from("decision_tree.yaml")
                .into("decision_tree")

                .loadYAML()
                .from("decision_tree.yaml")
                .into("decision_tree2")
                .nestedIn("params")

                .selectMax()
                .onColumn("time%")
                .onTable("time")

                .concactHorizontal()
                .toTable("final")
                .onTables("decision_tree", "decision_tree2", "time", "vitis")

                .end();
        })
        .save()
        .tables("final")
        .to("assignment2Files/output.html")
        .as("html")

        .end();
```

## Table Representation
The `Table`, `Column`, and `Row` classes interact to represent and manipulate tabular data.
The `Table` class manages a collection of `Column` objects, which define the structure of the table, and `Row` objects, which hold the actual data.
The `Table` class provides methods to add, update, delete, and query rows, as well as to manipulate columns.
Each `Row` object contains a map of column names to values, allowing for easy access and modification of data.
The `Column` class defines the properties of a column, such as its name, type, default value, and nullability, ensuring that the data in each row adheres to the table's schema.
Together, these classes enable the creation, modification, and querying of table data in a structured and consistent manner.

## Operations Basis
1. **DataBaseBuilder Class**
is responsible for creating and managing database tables. It extends the ``OperationBuilder`` class and provides methods to add, retrieve, and remove tables. It also includes methods to set the current directory and resolve file paths. The class maintains a collection of tables using a ``ListOrderedMap``.  
2. **OperationBuilder Class**
is an abstract class that represents a builder for various operations. It provides methods to execute different types of operations, such as loading JSON, XML, and YAML files, selecting maximum and minimum values, filtering data, concatenating tables horizontally, and saving data. Each operation returns a new instance of the corresponding operation class, allowing for a fluent API. The class also includes an ``end`` method to finalize the last operation.

## Operations
1. **ConcatHorizontalOperation**
   Usage Explanation: This class is used to concatenate multiple tables horizontally, meaning it combines the columns of the specified tables into a single table.  Example:
```java
    .concactHorizontal()
    .toTable("final")
    .onTables("decision_tree", "decision_tree2", "time", "vitis")
```

2. **DropOperation**
   Usage Explanation: This class is used to drop a column from a table. Example:
```java
    .drop()
    .table("table_name")
```

3. **FilterOperation**
    Usage Explanation: This class is used to filter rows in a table based on a specified condition and store the result in a target table.
```java
    .filter()
    .table("table_name")
    .where("column_name", "condition", "value")
    .toTable("target_table")
```

4. **LoadJSONOperation**
    Usage Explanation: This class is used to load data from a JSON file into a table. Example:
```java
    .loadJSON()
    .from("file_path")
    .into("table_name")
    .withAttributes("attribute1", "attribute2", "attribute3")
    .nestedIn("nested_attribute1", "nested_attribute2")
```

5. **LoadXMLOperation**
    Usage Explanation: This class is used to load data from an XML file into a table. Example:
```java
    .loadXML()
    .from("file_path")
    .into("table_name")
    .nestedIn("nested_element1", "nested_element2")
```
  If no `withAttributes` method is called, the operation will load all attributes from the XML file. 

6. **LoadYAMLOperation**
    Usage Explanation: This class is used to load data from a YAML file into a table. Example:
```java
    .loadYAML()
    .from("file_path")
    .into("table_name")
    .nestedIn("nested_element1", "nested_element2")
```
  If no `withAttributes` method is called, the operation will load all attributes from the YAML file.

7. **SaveOperation**
    Usage Explanation: This class is used to save the data from a table to a file. Example:
```java
    .save()
    .tables("table_name")
    .to("file_path")
    .as("format")
```

8. **SelectMaxOperation**
    Usage Explanation: This class is used to select the row with the maximum value in a specified column. Example:
```java
    .selectMax()
    .onColumn("column_name")
    .onTable("table_name")
```

9. **SelectMinOperation**
    Usage Explanation: This class is used to select the row with the minimum value in a specified column. Example:
```java
    .selectMin()
    .onColumn("column_name")
    .onTable("table_name")
```

10. **RenameOperation**
    Usage Explanation: This class is used to rename a column in a table. Example:
```java
    .rename()
    .table("table_name")
    .from("column_old_name")
    .to("column_new_name")
```

11. **ProcessFoldersOperation**
    Usage Explanation: This class is used to process multiple folders and execute a sequence of operations for each folder. Example:
```java
    .processFolders()
    .folders("folder1", "folder2", "folder3")
    .operations(() -> {
        // Define operations for each folder
    })
```

12. **EndOperation**
    Usage Explanation: This class is used to finalize the sequence of operations. Example:
```java
    .end();
```

13. **JoinOperation**
    Usage Explanation: This class is used to join two tables based on a common column. Example:
```java
    .join()
    .tables("table1", "table2")
    .on("column_name")
    .toTable("target_table")
```
    It may still have some bugs.

---
# Checkpoint 3

## Compile and Run

### Compile the Project

To compile and install the program, run the following command:
```bash
gradle installDist
```
This will compile the classes and create a launcher script in the build/install/dsl-project/bin folder. For convenience, there are two script files in the root of the repository:

For Windows: ```dsl-project.bat```
For Linux: ```dsl-project```

### Running the Program
To execute the DSL script:

1. Place your input DSL file (e.g., example.mydsl) in the root folder.
2. Run the appropriate command:

On Linux:

```bash
Copy code
./gradlew run --args="src/main/resources/example.mydsl"
```
On Windows:
```bash
Copy code
.\gradlew.bat run --args="src/main/resources/example.mydsl"
```
The program will parse the DSL file, process the input data, and generate the output as specified in the script.

## Configuration and DSL Features
**Example DSL Script**
The DSL enables users to load, manipulate, and save data systematically. Below is an example script:

```plaintext
.loadJSON()
.from("profiling.json")
.into("functions")
.nestedIn("functions")
.selectTop(3)
.renameColumn("name", "name #1")
.save()
.to("output.html")
.as("html")
.end();
```

## Key Operations

**Data Loading**: Load data from JSON, XML, and YAML files.

**Column Operations**: Rename columns, extract nested sections, and calculate values.

**Data Saving**: Export results in formats like CSV or HTML.

## Development Details
### Semantic Model
The DSL operates on a semantic model that supports:
- Representing tabular data (Table, Column, Row).
- Implementing a fluent API for operations (e.g., loadJSON, renameColumn, save).
### Grammar
The grammar for the DSL is defined using Xtext, supporting operations like data loading, renaming, and saving:

```antlr
LoadJSON:
    '.loadJSON()'
    '.from(' file=STRING ')'
    '.into(' table=STRING ')'
    ('.nestedIn(' nested+=STRING (',' nested+=STRING)* ')')?;
```
### Backend
The backend executes parsed DSL scripts using the ```DataBaseBuilder``` API. Each DSL operation maps directly to Java methods.

# Group

ELS2024-9

|Student Number| Name                   |
|----|------------------------|
|201806629|Ana Sofia Oliveira Teixeira|
|202006605|João António Maricato Malva|
|202008867|João Tomás Marques Félix|
