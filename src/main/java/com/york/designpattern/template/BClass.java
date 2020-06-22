package com.york.designpattern.template;

/**
 * @author york
 * @create 2020-06-22 11:05
 **/
public class BClass {

    public void process(ICallback callback) {
        // doSomthing 同步回调
        callback.methodCallback();
        // doSomthing
    }
}
