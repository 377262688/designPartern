package com.york.designpattern.template;

/**
 * @author york
 * @create 2020-06-22 10:46
 **/
public class ConcreteTemplate2 extends AbstractTemplate {

    @Override
    protected void method1() {
        System.out.println("template2 method1 runing");
    }

    @Override
    protected void method2() {
        System.out.println("template2 method2 runing");
    }
}
