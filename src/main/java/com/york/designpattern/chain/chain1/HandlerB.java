package com.york.designpattern.chain.chain1;

/**
 * @author york
 * @create 2020-06-22 16:26
 **/
public class HandlerB implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = false;
        System.out.println("HandlerB1 处理");
        return handled;
    }
}
