package behavioral.visitor;

public class TextDocument implements DocumentElement {
    private String text;

    public TextDocument(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
