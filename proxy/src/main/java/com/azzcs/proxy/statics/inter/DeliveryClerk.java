package com.azzcs.proxy.statics.inter;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:47 上午
 */
public class DeliveryClerk implements IOrder{

    private Customer customer2;

    public DeliveryClerk(Customer customer2) {
        this.customer2 = customer2;
    }

    public void order(String foodName) {
        customer2.order(foodName);
        System.out.println("正在配送，请稍等...");
    }
}
