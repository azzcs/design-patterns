package com.azzcs.proxy.dynamic.jdk.explain;

import com.azzcs.proxy.dynamic.jdk.IOrder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: wzg
 * @Date: 2020/10/20 10:39 上午
 * 模拟 Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
 */
public class DeliveryClerk implements IOrder {

    // 接收外部传入的InvocationHandler
    private InvocationHandler handler;

    public DeliveryClerk(InvocationHandler handler) {
        this.handler = handler;
    }

    public void order(String foodName) {
        try {
            Method method = IOrder.class.getMethod("order",String.class);
            handler.invoke(this, method, new Object[]{foodName});
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
