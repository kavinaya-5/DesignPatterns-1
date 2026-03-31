package structuralpattern.decoratorpattern.pizzatoppingsystem.concretecomponent;

import structuralpattern.decoratorpattern.pizzatoppingsystem.component.Pizza;

public class BasicPizza implements Pizza {

    public String getDescription()
    {
        return "Basic Pizza";
    }

    public int amount()
    {
        return 100;
    }
}
