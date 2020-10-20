package com.azzcs.singleton.lazy;

import java.io.*;

/**
 * @Author: wzg
 * @Date: 2020/10/19 4:03 下午
 * 通过饿汉式验证序列化后会创建不同对象的问题
 */
public class SerializableSingleton implements Serializable {

    private static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {
    }


    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }


    /**
     * 解决序列化后不是同一对象问题
     * @return
     */
    private Object readResolve(){
        return INSTANCE;
    }




    public static void main(String[] args) {
        SerializableSingleton s1 = null;
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        try (FileOutputStream fos = new FileOutputStream("SerializableSingle.obj")) {
            try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(s2);
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
                s1 = (SerializableSingleton)ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(s1 == s2);
    }
}
