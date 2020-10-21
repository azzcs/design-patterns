package com.azzcs.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: wzg
 * @Date: 2020/10/20 1:56 下午
 */
public class MethodHandler implements MethodInterceptor {

    private Customer customer;

    public MethodHandler(Customer customer) {
        this.customer = customer;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if("order".equals(method.getName())){
            methodProxy.invoke(customer,objects);
            System.out.println("正在配送，请稍等...");
        }else {
            method.invoke(customer,objects);
        }
        return null;
    }
}
