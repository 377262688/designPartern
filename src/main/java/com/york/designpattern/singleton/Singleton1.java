package com.york.designpattern.singleton;

/**
 * @author york
 * @create 2020-06-17 17:13
 * 饿汉式单例模式
 **/
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
