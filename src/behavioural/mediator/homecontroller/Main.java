package behavioural.mediator.homecontroller;

import behavioural.mediator.homecontroller.concretemediator.SmartHomeController;
import behavioural.mediator.homecontroller.*;

public class Main {
    public static void main(String[] args) {

        SmartHomeController mediator = new SmartHomeController();

//        structuralpattern.facadepattern.smarthomecontroller.subsystems.Light light = new Light();
        Fan fan = new Fan();
        Light light=new Light();

        mediator.setLight(light);
        mediator.setFan(fan);

        Button button = new Button(mediator);

        button.press();
    }
}
