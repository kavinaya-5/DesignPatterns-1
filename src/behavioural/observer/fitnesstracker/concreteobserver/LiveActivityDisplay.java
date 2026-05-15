package behavioural.observer.fitnesstracker.concreteobserver;

import behavioural.observer.fitnesstracker.observer.FitnessDataObserver;
import behavioural.observer.fitnesstracker.concretesubject.*;
public class LiveActivityDisplay implements FitnessDataObserver {
    @Override
    public void update(FitnessData data) {
        System.out.println("Live Display → Steps: " + data.getSteps() +
                " | Active Minutes: " + data.getActiveMinutes() +
                " | Calories: " + data.getCalories());
    }
}
