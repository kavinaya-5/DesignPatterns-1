package behavioural.templatepattern.beveragemaker.concreteclasees;

import behavioural.templatepattern.beveragemaker.abstractclass.BeverageMaker;

public class TeaMaker extends BeverageMaker {

    public void brew()
    {
        System.out.println("Steeping the tea");
    }

    public void addCondiments()
    {
        System.out.println("Adding sugar");
    }
}
