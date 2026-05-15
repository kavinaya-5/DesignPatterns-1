package behavioural.strategy.textformatter.client;

import behavioural.strategy.textformatter.concretestrategy.LowerCaseFormatter;
import behavioural.strategy.textformatter.context.TextEditor;
import behavioural.strategy.textformatter.strategy.TextFormatter;

public class PublishText {
    public static void main(String[] args) {
        TextFormatter textFormatter=new LowerCaseFormatter();

        TextEditor textEditor=new TextEditor(textFormatter);
        textEditor.setFormat("Kavi Got Placed");
    }
}
