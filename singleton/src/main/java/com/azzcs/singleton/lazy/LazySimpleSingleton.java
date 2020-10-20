package com.azzcs.singleton.lazy;

/**
 * @Author: wzg
 * @Date: 2020/10/19 3:07 下午
 * 懒汉式单例
 * 缺点：使用synchronized关键字会锁住整个类，性能不佳
 */
public class LazySimpleSingleton {

    private volatile static LazySimpleSingleton INSTANCE = null;

    private LazySimpleSingleton() {

    }

    public static synchronized LazySimpleSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySimpleSingleton();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i < 2;i++){
            new Thread(() -> {
                LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
