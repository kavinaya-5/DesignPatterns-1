package behavioural.state.trafficlight.context;

import behavioural.state.trafficlight.concretestate.RedState;
import behavioural.state.trafficlight.state.TrafficLightState;

public class TrafficLight {

    private TrafficLightState trafficLightState;

    public TrafficLight()
    {
        this.trafficLightState=new RedState();
    }
    public void setState(TrafficLightState trafficLightState)
    {
        this.trafficLightState=trafficLightState;
    }

    public void change()
    {
        trafficLightState.change(this);
    }


}
