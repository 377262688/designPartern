package com.york.designpattern.observer;

/**
 * @author york
 * @create 2020-06-22 10:22
 **/
public class ConcretObserverOne implements Observer {

    public void update(Message message) {
        System.out.println("concretObserverOne is notified");
    }
}
