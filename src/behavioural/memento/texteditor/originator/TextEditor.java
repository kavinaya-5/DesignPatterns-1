package behavioural.memento.texteditor.originator;

import behavioural.memento.texteditor.memento.TextEditorMemento;

public class TextEditor {
    String context="";

    public void type(String newText)
    {
        context+=newText;
        System.out.println("Typed:\""+newText+"\"");
    }

    public String getContext()
    {
        return context;
    }

    public TextEditorMemento save()
    {
        System.out.println("Saving state:   \""+context+"\"");
        return new TextEditorMemento(context);
    }
    public void restore(TextEditorMemento memento)
    {
        context=memento.getState();
        System.out.println("Restores:"+context);
    }
}
