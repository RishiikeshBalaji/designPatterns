package behavioral.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
