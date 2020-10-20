package com.azzcs.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: wzg
 * @Date: 2020/10/19 4:32 下午
 * 注册型实现单例(双重锁检查)
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) throws Exception {
        Object bean = ioc.get(className);
        if (bean != null) {
            return bean;
        }
        synchronized (ioc) {
            bean = ioc.get(className);
            if(bean == null) {
                bean = Class.forName(className).newInstance();
                ioc.put(className, bean);
                return bean;
            }
            return bean;
        }
    }

    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Object bean = null;
                try {
                    bean = ContainerSingleton.getBean(ContainerSingleton.class.getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(bean);
            }).start();
        }
    }
}
