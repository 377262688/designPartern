package com.york.designpattern.strategy;

/**
 * @author york
 * @create 2020-06-22 15:43
 **/
public class Order {

    private OrderType orderType;

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }
}
