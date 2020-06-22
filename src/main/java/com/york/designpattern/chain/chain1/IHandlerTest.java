package com.york.designpattern.chain.chain1;

/**
 * @author york
 * @create 2020-06-22 16:32
 **/
public class IHandlerTest {

    public static void main(String[] args) {
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new HandlerA());
        handlerChain.addHandler(new HandlerB());
        handlerChain.handle();
    }
}
