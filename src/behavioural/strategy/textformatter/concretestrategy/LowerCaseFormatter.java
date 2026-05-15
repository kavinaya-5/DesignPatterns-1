package behavioural.strategy.textformatter.concretestrategy;

import behavioural.strategy.textformatter.strategy.TextFormatter;

public class LowerCaseFormatter  implements TextFormatter {
    public void format(String text)
    {
        System.out.println("Lower case formatter");
        System.out.println(text.toLowerCase());
    }
}
