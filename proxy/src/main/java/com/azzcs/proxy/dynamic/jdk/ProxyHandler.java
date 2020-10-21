package com.azzcs.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: wzg
 * @Date: 2020/10/20 11:06 上午
 * 代理handler
 */
public class ProxyHandler implements InvocationHandler {
    private Customer customer;

    public ProxyHandler(Customer customer) {
        this.customer = customer;
    }

    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            if (method.getName().equals("order")) {
                method.invoke(customer, args);
                System.out.println("正在配送，请稍等...");
            }else {
                return method.invoke(customer,args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
