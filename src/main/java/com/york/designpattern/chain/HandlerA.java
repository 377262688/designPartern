package com.york.designpattern.chain;

/**
 * @author york
 * @create 2020-06-22 16:10
 **/
public class HandlerA extends Handler {
    @Override
    public boolean doHandle() {
        System.out.println("handlerA c处理");
        return false;
    }
}
