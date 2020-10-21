/**
 * @Author: wzg
 * @Date: 2020/10/20 2:16 下午
 * 动态代理模式
 * 是很多框架中经常使用的设计模式
 * 1、在spring中两种代理模式都有使用，
 * 如果目标类实现了接口，就会使用jdk动态代理。否则会使用cglib。
 * 2、在dubbo+zookeeper时，最好配置CGLIB动态代理。因为dubbo
 * 会使用基于包名的扫描方式进行类的处理。而jdk动态代理生成的包是
 * com.sun.proxy...格式。而我们需要的是与目标类相同的包名。
 */
package com.azzcs.proxy.dynamic;