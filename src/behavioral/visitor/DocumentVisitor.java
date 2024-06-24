package behavioral.visitor;

public interface DocumentVisitor {
    void visit(TextDocument textDocument);
    void visit(SpreadsheetDocument spreadsheetDocument);
}
