package behavioural.memento.texteditor.memento;

import behavioural.strategy.textformatter.context.TextEditor;

public class TextEditorMemento {
    private  String state;

    public TextEditorMemento(String state)
    {
        this.state=state;
    }

    public String getState()
    {
        return state;
    }

}
