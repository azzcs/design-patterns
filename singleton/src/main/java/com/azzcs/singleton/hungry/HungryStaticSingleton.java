package com.azzcs.singleton.hungry;

/**
 * @Author: wzg
 * @Date: 2020/10/19 3:01 下午
 * 饿汉式单例
 * 缺点：不被使用也会被初始化，浪费资源
 */
public class HungryStaticSingleton {

    private static HungryStaticSingleton instance;


    static {
        instance =  new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        for(int i = 0;i < 2;i++){
            new Thread(() -> {
                HungryStaticSingleton instance = HungryStaticSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
