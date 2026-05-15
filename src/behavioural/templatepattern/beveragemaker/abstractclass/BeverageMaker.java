package behavioural.templatepattern.beveragemaker.abstractclass;

public  abstract class BeverageMaker {

    public void prepareBeverage()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater()
    {
        System.out.println("Water is Boiling");
    }

    public void pourInCup()
    {
        System.out.println("Pouring into cup");
    }
    public abstract void brew();
     public abstract void addCondiments();
}
