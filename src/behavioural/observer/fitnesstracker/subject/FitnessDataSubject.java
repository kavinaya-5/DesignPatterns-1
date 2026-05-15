package behavioural.observer.fitnesstracker.subject;

import behavioural.observer.fitnesstracker.observer.FitnessDataObserver;

public interface FitnessDataSubject {
       void registerObserver(FitnessDataObserver observer);
       void removeObserver(FitnessDataObserver observer);
       void notifyObservers();

}
