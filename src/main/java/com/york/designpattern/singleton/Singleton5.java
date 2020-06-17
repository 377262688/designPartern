package com.york.designpattern.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author york
 * @create 2020-06-17 17:37
 **/
public enum Singleton5 {
    INSTANCE;

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public long getId() {
        return atomicInteger.getAndIncrement();
    }
}
