package com.azzcs.proxy.dynamic.cglib;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:46 上午
 * 目标对象
 */
public class Customer {
    public void order(String foodName) {
        System.out.println("想吃："+foodName);
    }
}
