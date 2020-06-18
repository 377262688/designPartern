package com.york.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @author york
 * @create 2020-06-18 11:34
 **/
public class ProxyTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.login();

        UserService userServiceExtendsProxy = new UserServiceExtendsProxy();
        userServiceExtendsProxy.login();

        Class<?>[] interfaces = userService.getClass().getInterfaces();
        UserServiceInvocationHandler userServiceInvocationHandler = new UserServiceInvocationHandler(userService);
        UserService dynamicProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),interfaces,userServiceInvocationHandler);
        dynamicProxy.login();
    }
}
