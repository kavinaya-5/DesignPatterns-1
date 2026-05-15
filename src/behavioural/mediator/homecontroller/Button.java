package behavioural.mediator.homecontroller;

import behavioural.mediator.homecontroller.mediator.SmartHomeMediator;

public class Button {

    private SmartHomeMediator mediator;
    public Button(SmartHomeMediator mediator)
    {
        this.mediator=mediator;
    }

    public void press()
    {
        mediator.pressButton();
    }
}
