package com.azzcs.singleton.lazy;

/**
 * @Author: wzg
 * @Date: 2020/10/19 3:07 下午
 * 懒汉式单例（双重检查）
 * 缺点：先进行一次检查，如果不为空则不执行锁逻辑，性能比LazySimpleSingleton高
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton INSTANCE = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (INSTANCE == null) {
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }


    public static void main(String[] args) {
        for(int i = 0;i < 2;i++){
            new Thread(() -> {
                LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
                System.out.println(instance);
            }).start();
        }
    }
}
