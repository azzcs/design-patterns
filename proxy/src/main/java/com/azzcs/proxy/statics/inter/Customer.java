package com.azzcs.proxy.statics.inter;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:46 上午
 */
public class Customer implements IOrder{
    public void order(String foodName) {
        System.out.println("想吃："+foodName);
    }
}
