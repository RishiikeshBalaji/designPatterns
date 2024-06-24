package structuralPatterns.decorator;

interface DataSource {
    void writeData(String data);
    String readData();
}