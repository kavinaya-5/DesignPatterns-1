package behavioural.state.trafficlight.concretestate;

import behavioural.state.trafficlight.context.TrafficLight;
import behavioural.state.trafficlight.state.TrafficLightState;

public class GreenState implements TrafficLightState {

    public void change(TrafficLight context)
    {
        System.out.println("Green Signal-GO");
        context.setState(new RedState());
    }
}
