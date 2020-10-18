package com.azzcs.factory.factorymethod;

import com.azzcs.factory.BMWCar;

/**
 * 工厂方法
 * 优点：抽象工厂方法，具体实体的创建过程推迟到自己的工厂实现
 * 缺点：
 * @Author: wzg
 * @Date: 2020/10/18 8:23 下午
 */
public interface FactoryMethod {
    BMWCar create();
}
