package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        DocumentElement textDocument = new TextDocument("Hello, this is a text document.");
        DocumentElement spreadsheetDocument = new SpreadsheetDocument(new String[][]{
                {"Name", "Age", "Department"},
                {"Alice", "30", "HR"},
                {"Bob", "25", "IT"}
        });

        DocumentVisitor printingVisitor = new PrintingVisitor();
        DocumentVisitor exportingVisitor = new ExportingVisitor();

        System.out.println("Using PrintingVisitor:");
        textDocument.accept(printingVisitor);
        spreadsheetDocument.accept(printingVisitor);

        System.out.println("\nUsing ExportingVisitor:");
        textDocument.accept(exportingVisitor);
        spreadsheetDocument.accept(exportingVisitor);
    }
}
