package behavioural.memento.texteditor;

import behavioural.memento.texteditor.caretaker.TextEditorUndoManager;
import behavioural.memento.texteditor.originator.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorUndoManager undoManager = new TextEditorUndoManager();

        editor.type("Hello");
        undoManager.save(editor);

        editor.type(" World");
        undoManager.save(editor);

        editor.type("!");
        System.out.println("Current: " + editor.getContext());

        System.out.println("\n--- Undo 1 ---");
        undoManager.undo(editor);
        System.out.println("Content: " + editor.getContext());

        System.out.println("\n--- Undo 2 ---");
        undoManager.undo(editor);
        System.out.println("Content: " + editor.getContext());

        System.out.println("\n--- Undo 3 ---");
        undoManager.undo(editor);
    }
}
