package behavioural.strategy.textformatter.context;

import behavioural.strategy.textformatter.strategy.TextFormatter;

public class TextEditor {

    TextFormatter textFormatter;

    public TextEditor(TextFormatter textFormatter)
    {
        this.textFormatter=textFormatter;
    }

    public void setFormat(String text)
    {
        textFormatter.format(text);
    }
}
