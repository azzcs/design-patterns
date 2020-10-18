package com.azzcs.factory.factorymethod;

import com.azzcs.factory.BMW320;
import com.azzcs.factory.BMWCar;

/**
 * @Author: wzg
 * @Date: 2020/10/18 8:42 下午
 */
public class BMW320Factory implements FactoryMethod{
    @Override
    public BMWCar create() {
        return new BMW320();
    }
}
