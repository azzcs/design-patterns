package com.azzcs.proxy.dynamic.jdk;

import com.azzcs.proxy.dynamic.jdk.explain.DeliveryClerk;

import java.lang.reflect.Proxy;

/**
 * @Author: wzg
 * @Date: 2020/10/20 11:04 上午
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        // 生成代理对象，强制转换为接口类型，这也是为什么必须实现接口的原因之一
        ProxyHandler proxyHandler = new ProxyHandler(customer);
        IOrder iOrder = (IOrder)Proxy.newProxyInstance(
                customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(),
                proxyHandler);
        iOrder.order("红烧肉");

        //模拟测试
        IOrder iOrder2 = new DeliveryClerk(proxyHandler);
        iOrder2.order("红烧肉");
    }
}
