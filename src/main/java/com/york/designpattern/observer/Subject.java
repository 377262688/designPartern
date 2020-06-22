package com.york.designpattern.observer;

/**
 * @author york
 * @create 2020-06-22 10:17
 **/
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(Message message);
}
