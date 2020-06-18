package com.york.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author york
 * @create 2020-06-18 11:44
 **/
public class UserServiceInvocationHandler implements InvocationHandler {
    private UserService userService;

    public UserServiceInvocationHandler(UserService userService) {
        this.userService = userService;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理类实现");
        if (method.getName().equals("login")) {
            userService.login();
        }
        System.out.println("动态代理类结束");
        return null;
    }
}
