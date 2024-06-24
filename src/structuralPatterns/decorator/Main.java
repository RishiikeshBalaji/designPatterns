package structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        String filename = "testfile.txt";
        DataSource fileDataSource = new FileDataSource(filename);

        System.out.println("Writing and Reading without Decorators:");
        fileDataSource.writeData("Hello, World!");
        System.out.println(fileDataSource.readData());

        System.out.println("\nWriting and Reading with Encryption:");
        DataSource encryptedDataSource = new EncryptedDataSource(fileDataSource);
        encryptedDataSource.writeData("Hello, World!");
        System.out.println(encryptedDataSource.readData());

        System.out.println("\nWriting and Reading with Compression:");
        DataSource compressedDataSource = new CompressedDataSource(fileDataSource);
        compressedDataSource.writeData("Hello, World!");
        System.out.println(compressedDataSource.readData());

        System.out.println("\nWriting and Reading with Both Encryption and Compression:");
        DataSource encryptedCompressedDataSource = new EncryptedDataSource(new CompressedDataSource(fileDataSource));
        encryptedCompressedDataSource.writeData("Hello, World!");
        System.out.println(encryptedCompressedDataSource.readData());
    }
}