package com.york.designpattern.chain;

/**
 * @author york
 * @create 2020-06-22 16:09
 **/
public abstract class Handler {

    protected Handler successor = null;

    public Handler() {
    }

    public void setSuccessor(Handler handler) {
        this.successor = handler;
    }

    public void handle() {
        boolean handled = doHandle();
        if (!handled && successor != null) {
            successor.handle();
        }
    }

    public abstract boolean doHandle();

}
