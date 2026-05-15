package behavioural.state.trafficlight.state;

import behavioural.state.trafficlight.context.TrafficLight;

public interface TrafficLightState {
    void change(TrafficLight context);
}
