package behavioral.visitor;

public class SpreadsheetDocument implements DocumentElement {
    private String[][] cells;

    public SpreadsheetDocument(String[][] cells) {
        this.cells = cells;
    }

    public String[][] getCells() {
        return cells;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
