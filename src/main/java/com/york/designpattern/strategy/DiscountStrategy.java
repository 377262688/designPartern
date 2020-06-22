package com.york.designpattern.strategy;

/**
 * 折扣订单
 * 策略定义
 * @author york
 * @create 2020-06-22 15:42
 **/
public interface DiscountStrategy {

    double calDiscount(Order order);
}
