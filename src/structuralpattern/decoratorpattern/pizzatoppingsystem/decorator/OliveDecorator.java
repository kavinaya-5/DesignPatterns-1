package structuralpattern.decoratorpattern.pizzatoppingsystem.decorator;

import structuralpattern.decoratorpattern.pizzatoppingsystem.component.Pizza;
import structuralpattern.decoratorpattern.pizzatoppingsystem.concretedecorator.PizzaDecorator;

public class OliveDecorator extends PizzaDecorator {

    public OliveDecorator(Pizza pizza)
    {
        super(pizza);
    }

    public String getDescription()
    {
        return pizza.getDescription()+",Cheese";
    }

    public int amount()
    {
        return pizza.amount()+50;
    }


}
