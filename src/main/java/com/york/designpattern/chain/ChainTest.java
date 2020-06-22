package com.york.designpattern.chain;

/**
 * @author york
 * @create 2020-06-22 16:19
 **/
public class ChainTest {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }
}
