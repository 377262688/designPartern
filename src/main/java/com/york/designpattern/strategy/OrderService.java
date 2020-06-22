package com.york.designpattern.strategy;

/**
 * @author york
 * @create 2020-06-22 15:49
 **/
public class OrderService {

    public double discount(Order order) {
        DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(order.getOrderType());
        return discountStrategy.calDiscount(order);
    }
}
