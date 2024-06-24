package behavioral.momento;
class TextEditorCaretaker {
    private final Stack<TextEditorMemento> mementos = new Stack<>();

    public void save(TextEditor textEditor) {
        mementos.push(textEditor.save());
    }

    public void undo(TextEditor textEditor) {
        if (!mementos.isEmpty()) {
            textEditor.restore(mementos.pop());
        }
    }
}
