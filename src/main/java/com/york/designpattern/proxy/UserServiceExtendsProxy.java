package com.york.designpattern.proxy;

/**
 * @author york
 * @create 2020-06-18 11:38
 **/
public class UserServiceExtendsProxy extends UserServiceImpl {

    @Override
    public void login() {
        System.out.println("代理类继承实现");
        super.login();
        System.out.println("代理类继承实现结束");
    }
}
