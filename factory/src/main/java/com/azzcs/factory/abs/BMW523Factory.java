package com.azzcs.factory.abs;

import com.azzcs.factory.BMW523;
import com.azzcs.factory.BMWCar;
import com.azzcs.factory.Engine;
import com.azzcs.factory.Engine523;

/**
 * @Author: wzg
 * @Date: 2020/10/18 8:42 下午
 */
public class BMW523Factory implements AbstractFactory {
    @Override
    public BMWCar createBMWCar() {
        return new BMW523();
    }

    @Override
    public Engine createEngine() {
        return new Engine523();
    }
}
