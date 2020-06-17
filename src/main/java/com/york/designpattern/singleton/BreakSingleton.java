package com.york.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author york
 * @create 2020-06-17 18:01
 **/
public class BreakSingleton {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton3 singleton3 = Singleton3.getInstance();
        Singleton3 singleton31 = Singleton3.getInstance();
        System.out.println(singleton3.hashCode());
        System.out.println(singleton31.hashCode());

        // 反射破坏单例，能破坏懒汉，饿汉，双重检查，内部类，不能破坏枚举
        Constructor<Singleton3> singleton3Constructor = Singleton3.class.getDeclaredConstructor();
        singleton3Constructor.setAccessible(true);
        Singleton3 singleton32 = singleton3Constructor.newInstance();
        System.out.println(singleton32.hashCode());

    }
}
