package structuralPatterns.decorator;

class BufferedDataSource extends DataSourceDecorator {
    public BufferedDataSource(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Adding buffering
        super.writeData(data);
    }

    @Override
    public String readData() {
        // Adding buffering
        return super.readData();
    }
}