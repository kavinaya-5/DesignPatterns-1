package behavioural.state.trafficlight.concretestate;

import behavioural.state.trafficlight.context.TrafficLight;
import behavioural.state.trafficlight.state.TrafficLightState;

public class YellowState implements TrafficLightState {

    public void change(TrafficLight context)
    {
        System.out.println("Yellow Signal -Ready To GO");
        context.setState(new GreenState());
    }
}
