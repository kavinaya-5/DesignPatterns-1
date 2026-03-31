package structuralpattern.decoratorpattern.pizzatoppingsystem.concretedecorator;

import structuralpattern.decoratorpattern.pizzatoppingsystem.component.Pizza;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
