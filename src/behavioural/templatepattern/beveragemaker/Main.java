package behavioural.templatepattern.beveragemaker;

import behavioural.templatepattern.beveragemaker.abstractclass.BeverageMaker;
import behavioural.templatepattern.beveragemaker.concreteclasees.TeaMaker;

public class Main {
    public static void main(String[] args) {
        BeverageMaker beverageMaker=new TeaMaker();
        beverageMaker.prepareBeverage();
    }
}
