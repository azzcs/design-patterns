package com.azzcs.singleton.register;

import java.io.*;

/**
 * @Author: wzg
 * @Date: 2020/10/19 4:32 下午
 * 枚举单例（饿汉式）
 * 枚举的本质是在静态代码块创建了实例
 * 优点：通过枚举只能创建一次的的特性，不能通过反射破坏
 */
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }


    public static void main(String[] args) {
        EnumSingleton e1 = null;
        EnumSingleton e2 = EnumSingleton.getInstance();

        try (FileOutputStream fos = new FileOutputStream("SerializableSingle.obj")) {
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(e2);
            }catch (IOException e){
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("SerializableSingle.obj")) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                e1 = (EnumSingleton)ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(e1 == e2);
    }

}
