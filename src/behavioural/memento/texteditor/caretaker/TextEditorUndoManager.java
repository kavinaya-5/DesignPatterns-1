package behavioural.memento.texteditor.caretaker;

import behavioural.memento.texteditor.memento.TextEditorMemento;
import behavioural.memento.texteditor.originator.TextEditor;

import java.util.Stack;

public class TextEditorUndoManager {

    Stack<TextEditorMemento> history=new Stack<>();

    public void save(TextEditor editor)
    {
        history.push(editor.save());
    }

    public void undo(TextEditor editor)
    {
        if(!history.isEmpty())
        {
            editor.restore(history.pop());
        }
        else {
            System.out.println("Nothing to undo");
        }
    }

    public int historySize()
    {
        return history.size();
    }
}
