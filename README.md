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

## Group

ELS2024-9

|Student Number| Name                   |
|----|------------------------|
|201806629|Ana Sofia Oliveira Teixeira|
|202006605|João António Maricato Malva|
|202008867|João Tomás Marques Félix|
