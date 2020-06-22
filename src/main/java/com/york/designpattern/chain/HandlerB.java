package com.york.designpattern.chain;

/**
 * @author york
 * @create 2020-06-22 16:10
 **/
public class HandlerB extends Handler {
    @Override
    public boolean doHandle() {
        System.out.println("handlerB 处理");
        return false;
    }
}
