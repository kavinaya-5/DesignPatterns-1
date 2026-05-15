package behavioural.observer.fitnesstracker.observer;

import behavioural.observer.fitnesstracker.concretesubject.FitnessData;

public interface FitnessDataObserver {
    void update(FitnessData data);

//    void update(FitnessData fitnessData);
}
