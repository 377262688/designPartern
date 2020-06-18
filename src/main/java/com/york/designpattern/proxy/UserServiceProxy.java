package com.york.designpattern.proxy;

/**
 * @author york
 * @create 2020-06-18 11:33
 **/
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }
    public void login() {
        System.out.println("代理模式。。。");
        userService.login();
        System.out.println("代理结束");
    }
}
