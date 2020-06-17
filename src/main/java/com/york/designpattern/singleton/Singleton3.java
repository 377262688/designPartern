package com.york.designpattern.singleton;

/**
 * @author york
 * @create 2020-06-17 17:13
 * 懒汉式单例模式
 **/
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
