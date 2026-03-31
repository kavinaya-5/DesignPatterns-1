package structuralpattern.decoratorpattern.pizzatoppingsystem;

import structuralpattern.decoratorpattern.pizzatoppingsystem.component.Pizza;
import structuralpattern.decoratorpattern.pizzatoppingsystem.concretecomponent.BasicPizza;
import structuralpattern.decoratorpattern.pizzatoppingsystem.decorator.CheeseDecorator;
import structuralpattern.decoratorpattern.pizzatoppingsystem.decorator.OliveDecorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new BasicPizza();

        CheeseDecorator cheeseDecorator=new CheeseDecorator(pizza);
        OliveDecorator oliveDecorator=new OliveDecorator(pizza);

        System.out.println(cheeseDecorator.getDescription());
        System.out.println(cheeseDecorator.amount());
    }
}
