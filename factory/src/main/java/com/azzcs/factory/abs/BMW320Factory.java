package com.azzcs.factory.abs;

import com.azzcs.factory.BMW320;
import com.azzcs.factory.BMWCar;
import com.azzcs.factory.Engine;
import com.azzcs.factory.Engine320;

/**
 * @Author: wzg
 * @Date: 2020/10/18 9:04 下午
 */
public class BMW320Factory implements AbstractFactory{
    @Override
    public BMWCar createBMWCar() {
        return new BMW320();
    }

    @Override
    public Engine createEngine() {
        return new Engine320();
    }
}
