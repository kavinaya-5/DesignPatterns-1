package behavioural.state.trafficlight;

import behavioural.state.trafficlight.context.TrafficLight;
import behavioural.state.trafficlight.state.TrafficLightState;

public class Main {
    public static void main(String[] args) {


        TrafficLight trafficLight=new TrafficLight();

        trafficLight.change();
        trafficLight.change();
    }
}
