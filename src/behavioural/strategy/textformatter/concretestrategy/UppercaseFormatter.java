package behavioural.strategy.textformatter.concretestrategy;

import behavioural.strategy.textformatter.strategy.TextFormatter;

public class UppercaseFormatter implements TextFormatter {

    public void format(String text)
    {
        System.out.println("Upper case formatter");
        System.out.println(text.toUpperCase());
    }
}
