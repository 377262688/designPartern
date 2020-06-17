package com.york.designpattern.singleton;

/**
 * @author york
 * @create 2020-06-17 17:13
 * 内部类
 **/
public class Singleton4 {


    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return SingletoHolder.instance;
    }

    private static class SingletoHolder {
        private static Singleton4 instance = new Singleton4();
    }
}
