package pt.up.fe.els2024.Builder.Operations;

import pt.up.fe.els2024.Builder.DataBaseBuilder;
import pt.up.fe.els2024.Builder.OperationBuilder;

public class LoadOperation extends OperationBuilder {

    private final String fileType;

    public LoadOperation(DataBaseBuilder builder, String fileType) {
        super(builder);
        this.fileType = fileType;
    }

    @Override
    protected OperationBuilder executeOperation() {
        switch (fileType.toLowerCase()) {
            case "json":
                return new LoadJSONOperation(getBuilder()).executeOperation();
            case "xml":
                return new LoadXMLOperation(getBuilder()).executeOperation();
            case "yaml":
                return new LoadYAMLOperation(getBuilder()).executeOperation();
            default:
                throw new UnsupportedOperationException("File type not supported: " + fileType);
        }
    }
}
