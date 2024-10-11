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

## Features
### Semantic Model:
- Represents tables (Table) and commands (Command) for file/table operations.
- Configuration files parsed by ConfigurationParser.

### Commands
- Load: Extracts data from files.
- Rename: Renames columns.
- Save: Exports as CSV.

### YAML Configuration
- Load:
  - files: List of file paths.
  - as: Name of the table created.
- Rename:
  - table: Name of the table.
  - columns: Map of old to new column names.
- Save:
  - table: Name of the table.
  - columns: List of columns to save.
  - out: File path;

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


## Group

ELS2024-9

|Student Number| Name                   |
|----|------------------------|
|201806629|Ana Sofia Oliveira Teixeira|
|202006605|João António Maricato Malva|
|202008867|João Tomás Marques Félix|
