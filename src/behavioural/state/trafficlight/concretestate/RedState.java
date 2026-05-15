package behavioural.state.trafficlight.concretestate;

import behavioural.state.trafficlight.context.TrafficLight;
import behavioural.state.trafficlight.state.TrafficLightState;

public class RedState implements TrafficLightState {

    public void change(TrafficLight context)
    {
        System.out.println("Red Signal-Stop");
        context.setState(new YellowState());
    }
}
