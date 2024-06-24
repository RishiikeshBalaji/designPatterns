package behavioral.visitor;

public class ExportingVisitor implements DocumentVisitor {
    @Override
    public void visit(TextDocument textDocument) {
        System.out.println("Exporting Text Document to PDF: " + textDocument.getText());
    }

    @Override
    public void visit(SpreadsheetDocument spreadsheetDocument) {
        System.out.println("Exporting Spreadsheet Document to CSV:");
        for (String[] row : spreadsheetDocument.getCells()) {
            for (String cell : row) {
                System.out.print(cell + ",");
            }
            System.out.println();
        }
    }
}
