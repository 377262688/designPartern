package com.york.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author york
 * @create 2020-06-22 15:43
 **/
public class DiscountStrategyFactory {

    private static final Map<OrderType,DiscountStrategy> strategies = new HashMap<>();

    static {
        strategies.put(OrderType.NORMAL,new NormalDiscountStrategy());
        strategies.put(OrderType.NORMAL,new GrouponDiscountStrategy());
        strategies.put(OrderType.NORMAL,new PromotionDiscountStrategy());
    }

    public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        return strategies.get(orderType);
    }
}
