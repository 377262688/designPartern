package com.york.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author york
 * @create 2020-06-22 10:19
 **/
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
