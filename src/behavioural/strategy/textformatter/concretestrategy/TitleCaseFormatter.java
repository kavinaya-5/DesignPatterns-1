package behavioural.strategy.textformatter.concretestrategy;

import behavioural.strategy.textformatter.strategy.TextFormatter;

public class TitleCaseFormatter implements TextFormatter {

    public void format(String text)
    {
        System.out.println("Title case formatter");
        System.out.println(Character.toUpperCase(text.charAt(0))+text.substring(1));
    }
}
