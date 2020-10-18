package com.azzcs.factory.factorymethod;

/**
 * @Author: wzg
 * @Date: 2020/10/18 8:42 下午
 */
public class Test {
    public static void main(String[] args) {
        FactoryMethod factory = new BMW320Factory();
        factory.create();
        factory = new BMW523Factory();
        factory.create();
    }
}
