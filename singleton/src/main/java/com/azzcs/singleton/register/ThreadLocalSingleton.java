package com.azzcs.singleton.register;

/**
 * @Author: wzg
 * @Date: 2020/10/19 10:32 下午
 * 当前线程安全的注册式单例
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE =
            ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance(){
        return INSTANCE.get();
    }

    public static void main(String[] args) {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.out.println(instance);
    }
}
