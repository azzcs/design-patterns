package com.azzcs.factory.abs;

import com.azzcs.factory.BMWCar;
import com.azzcs.factory.Engine;

/**
 * 抽象工厂模式（工厂方法的升级，可以创建一组对象）
 * @Author: wzg
 * @Date: 2020/10/18 8:48 下午
 */
public interface AbstractFactory {
    BMWCar createBMWCar();
    Engine createEngine();
}
