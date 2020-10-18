package com.azzcs.factory.abs;

/**
 * @Author: wzg
 * @Date: 2020/10/18 9:05 下午
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new BMW320Factory();
        factory.createBMWCar();
        factory.createEngine();
        factory = new BMW523Factory();
        factory.createBMWCar();
        factory.createEngine();
    }
}
