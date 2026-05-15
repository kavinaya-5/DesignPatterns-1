package behavioural.mediator.homecontroller.concretemediator;

import behavioural.mediator.homecontroller.Fan;
import behavioural.mediator.homecontroller.mediator.SmartHomeMediator;
import behavioural.mediator.homecontroller.Light;

public class SmartHomeController implements SmartHomeMediator {

    private Light light;
    private Fan fan;

    public void setLight(Light light)
    {
        this.light=light;
    }

    public void setFan(Fan fan)
    {
        this.fan=fan;
    }
    public void pressButton()
    {
        light.turnOn();
        fan.on();
    }
}
