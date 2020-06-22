package com.york.designpattern.template;

/**
 * @author york
 * @create 2020-06-22 10:44
 **/
public abstract class AbstractTemplate {

    public final void templateMethod() {

        method1();
        method2();
    }

    protected abstract void method1();
    protected abstract void method2();
}
