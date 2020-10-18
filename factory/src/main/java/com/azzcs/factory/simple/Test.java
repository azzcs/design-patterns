package com.azzcs.factory.simple;


/**
 * @Author: wzg
 * @Date: 2020/10/18 8:12 下午
 */
public class Test {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        factory.create("320");
        factory.create("523");
    }
}
