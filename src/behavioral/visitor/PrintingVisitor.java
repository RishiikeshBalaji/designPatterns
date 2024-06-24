package behavioral.visitor;

public class PrintingVisitor implements DocumentVisitor {
    @Override
    public void visit(TextDocument textDocument) {
        System.out.println("Printing Text Document: " + textDocument.getText());
    }

    @Override
    public void visit(SpreadsheetDocument spreadsheetDocument) {
        System.out.println("Printing Spreadsheet Document:");
        for (String[] row : spreadsheetDocument.getCells()) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
