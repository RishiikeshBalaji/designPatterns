package structuralPatterns.decorator;


class EncryptedDataSource extends DataSourceDecorator {
    public EncryptedDataSource(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        return decrypt(super.readData());
    }

    private String encrypt(String data) {
        return "ENCRYPTED:" + data; // Simplified encryption
    }

    private String decrypt(String data) {
        return data.replace("ENCRYPTED:", ""); // Simplified decryption
    }
}
