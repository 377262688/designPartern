package com.york.designpattern.adapter;

/**
 * @author york
 * @create 2020-06-19 17:36
 **/
public interface DefineLogger {

    boolean isTraceEnabled();

    void trace(String msg);

    void debug(String msg);

    void info(String msg);

}
