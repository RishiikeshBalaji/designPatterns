package behavioral.momento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        textEditor.setText("Version 1");
        caretaker.save(textEditor);
        System.out.println("Text: " + textEditor.getText());

        textEditor.setText("Version 2");
        caretaker.save(textEditor);
        System.out.println("Text: " + textEditor.getText());

        textEditor.setText("Version 3");
        System.out.println("Text: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After Undo, Text: " + textEditor.getText());

        caretaker.undo(textEditor);
        System.out.println("After Undo, Text: " + textEditor.getText());
    }
}
