package structuralpattern.decoratorpattern.pizzatoppingsystem.decorator;

import structuralpattern.decoratorpattern.pizzatoppingsystem.component.Pizza;
import structuralpattern.decoratorpattern.pizzatoppingsystem.concretedecorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator {

    public  CheeseDecorator(Pizza pizza)
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
