package com.azzcs.proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author: wzg
 * @Date: 2020/10/20 12:07 下午
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer();
        MethodHandler methodHandler = new MethodHandler(customer);
        // 输出代理类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/data/cglib_class");
        Customer cus = (Customer) Enhancer.create(
                customer.getClass(),
                methodHandler);
        cus.order("红烧茄子");
    }
}
