package com.york.designpattern.strategy;

/**
 * @author york
 * @create 2020-06-22 15:46
 **/
public class GrouponDiscountStrategy implements DiscountStrategy {
    @Override
    public double calDiscount(Order order) {
        return 0;
    }
}
