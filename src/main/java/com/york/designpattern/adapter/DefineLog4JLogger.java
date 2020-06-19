package com.york.designpattern.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author york
 * @create 2020-06-19 17:36
 **/
public class DefineLog4JLogger implements DefineLogger{

    private Logger logger;
    public DefineLog4JLogger(Logger logger) {
        this.logger = logger;
    }
    public boolean isTraceEnabled() {
        return logger.isLoggable(Level.ALL);
    }

    public void trace(String msg) {
        logger.toString();
    }

    public void debug(String msg) {
        logger.toString();
    }

    public void info(String msg) {
        logger.toString();
    }

}
