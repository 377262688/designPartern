package com.york.designpattern.observer;

/**
 * @author york
 * @create 2020-06-22 10:23
 **/
public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.registerObserver(new ConcretObserverOne());
        subject.registerObserver(new ConcretObserverTwo());
        subject.notifyObserver(new Message());
    }
}
