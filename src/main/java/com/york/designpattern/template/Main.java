package com.york.designpattern.template;

/**
 * @author york
 * @create 2020-06-22 10:47
 **/
public class Main {

    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteTemplate();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteTemplate2();
        abstractTemplate.templateMethod();;
    }
}
