package behavioural.templatepattern.beveragemaker.concreteclasees;

import behavioural.templatepattern.beveragemaker.abstractclass.BeverageMaker;

public  class CoffeeMaker extends BeverageMaker {

    public void brew()
    {
        System.out.println("Brewing the coffee");
    }

    public void addCondiments()
    {
        System.out.println("Adding sugar");
    }
}
