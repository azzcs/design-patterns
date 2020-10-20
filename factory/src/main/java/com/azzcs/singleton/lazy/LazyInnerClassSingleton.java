package com.azzcs.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * @Author: wzg
 * @Date: 2020/10/19 3:37 下午
 * 懒汉式单例（内部类）
 * 优点：通过内部类加载过程创建单例，性能很高
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        // 防止通过反射创建
        if (LazyHolder.LAZY != null){
            throw new RuntimeException("单例已经存在");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }


    public static void main(String[] args) throws Exception {
        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor<?> c = clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        LazyInnerClassSingleton o2 = LazyInnerClassSingleton.getInstance();
        Object o1 = c.newInstance();
        System.out.println(o1 == o2);
    }
}
