package com.azzcs.proxy.statics.inter;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:51 上午
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        IOrder iOrder = new DeliveryClerk(customer);
        iOrder.order("麻婆豆腐");
    }
}
