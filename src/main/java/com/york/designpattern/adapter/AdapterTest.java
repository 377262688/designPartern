package com.york.designpattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author york
 * @create 2020-06-19 15:46
 **/
public class AdapterTest {
    public static void main(String[] args) throws IOException {
//        ClassLoader loggerFactoryClassLoader = LoggerFactory.class.getClassLoader();
//        System.out.println(loggerFactoryClassLoader);
//        Enumeration<URL> paths = loggerFactoryClassLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
//        while (paths.hasMoreElements()) {
//            System.out.println(paths.nextElement().getPath());
//        }
        Logger logger = LoggerFactory.getLogger(AdapterTest.class);

        System.out.println(logger.getClass());
        logger.info("sss");
    }
}
