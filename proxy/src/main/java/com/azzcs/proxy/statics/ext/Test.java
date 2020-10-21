package com.azzcs.proxy.statics.ext;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:40 上午
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new DeliveryClerk();
        customer.order("麻婆豆腐");
    }
}
