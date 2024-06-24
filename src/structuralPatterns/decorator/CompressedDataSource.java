package structuralPatterns.decorator;

class CompressedDataSource extends DataSourceDecorator {
    public CompressedDataSource(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        return "COMPRESSED:" + data; // Simplified compression
    }

    private String decompress(String data) {
        return data.replace("COMPRESSED:", ""); // Simplified decompression
    }
}