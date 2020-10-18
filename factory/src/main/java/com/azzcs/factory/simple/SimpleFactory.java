package com.azzcs.factory.simple;

import com.azzcs.factory.BMW320;
import com.azzcs.factory.BMW523;
import com.azzcs.factory.BMWCar;

/**
 * 简单工厂模式
 * 优点：创建对象交给工厂，使用者省去繁琐的创建过程
 * 缺点：增加类型也需要增加工厂类代码，工厂类臃肿，违反开闭原则
 * @Author: wzg
 * @Date: 2020/10/18 8:12 下午
 */
public class SimpleFactory {
    BMWCar create(String type){
        switch (type){
            case "320":
                return new BMW320();
            case "523":
                return new BMW523();
            default:
                return null;
        }
    }
}
