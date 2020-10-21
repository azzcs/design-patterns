package com.azzcs.proxy.dynamic.jdk;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:46 上午
 * 目标对象
 */
public class Customer implements IOrder {
    public void order(String foodName) {
        System.out.println("想吃："+foodName);
    }
}
