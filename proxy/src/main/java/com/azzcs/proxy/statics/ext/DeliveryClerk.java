package com.azzcs.proxy.statics.ext;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:39 上午
 * 代理对象
 */
public class DeliveryClerk extends Customer {

    @Override
    public void order(String foodName) {
        super.order(foodName);
        System.out.println("正在配送，请稍等...");
    }
}
