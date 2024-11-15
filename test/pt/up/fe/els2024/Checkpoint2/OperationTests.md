# Tests

## Operation Tests

### Test LoadJSON Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/profiling.json")
        .into("time")
        .withAttributes("time%", "seconds", "name")
    .printAll()
    .end();
```

### Test LoadXML Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadXML()
        .from("assignment2Files/vitis-report.xml")
        .into("vitis")
        .nestedIn("AreaEstimates", "Resources")
    .printAll()
    .end();
```

### Test LoadYAML Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadXML()
        .loadYAML()
		.from("assignment2Files/decision_tree.yaml")
		.into("decision_tree")
    .printAll()
    .end();
```

### Test LoadYAML Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadYAML()
        .from("assignment2Files/decision_tree.yaml")
		.into("decision_tree2")
		.nestedIn("params")
    .printAll()
    .end();
```


### Test Max Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/profiling.json")
        .into("time")
        .withAttributes("time%", "seconds", "name")
    .selectMax()
        .onColumn("time%")
		.onTable("time")
    .printAll()
    .end();
```

### Test Min Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/profiling.json")
        .into("time")
        .withAttributes("time%", "seconds", "name")
    .selectMin()
        .onColumn("time%")
		.onTable("time")
    .printAll()
    .end();
```

### Test Select Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
        .loadJSON()
            .from("assignment2Files/profiling.json")
            .into("time")
            .withAttributes("time%", "seconds", "name")
        .select()
            .select("time%")
            .fromTable("time")
            .toTable("time2")
        .printAll()
        .end();
```

### Test Filter Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
        .loadJSON()
            .from("assignment2Files/profiling.json")
            .into("time")
            .withAttributes("time%", "seconds", "name")
        .filter()
            .onColumn("time%")
            .onTable("time")
            .toTable("filteredTime")
            .where(">", "0.5")
        .printAll()
        .end();
```


### Test Concatenate Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/profiling.json")
        .into("time")
        .withAttributes("time%", "seconds", "name")
    .concactHorizontal()
        .toTable("final")
        .onTables("decision_tree", "decision_tree2", "time", "vitis")
    .printAll()
    .end();
```

### Test Rename Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/profiling.json")
        .into("time")
        .withAttributes("time%", "seconds", "name")
    .rename()
        .table("time")
        .from("time%")
        .to("Time")
    .printAll()
    .end();
```

### Test Limit Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/testLimitTable.json")
        .into("testLimit")
        .withAttributes("time%", "seconds", "name")

    .limit()
        .table("testLimit")
        .from(5)
        .to(10)
    .printAll()
    .end();
```

### Test Drop Operation
```
DataBaseBuilder db = new DataBaseBuilder();
db
    .loadJSON()
        .from("assignment2Files/profiling.json")
        .into("time")
        .withAttributes("time%", "seconds", "name")
    .drop()
            .table("time")
    .printAll()
    .end();
```
