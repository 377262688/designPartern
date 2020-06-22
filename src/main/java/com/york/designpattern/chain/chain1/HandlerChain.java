package com.york.designpattern.chain.chain1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author york
 * @create 2020-06-22 16:27
 **/
public class HandlerChain {

    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }

}
