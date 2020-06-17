package com.york.designpattern.singleton;

/**
 * @author york
 * @create 2020-06-17 17:13
 * 懒汉式单例模式
 **/
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
