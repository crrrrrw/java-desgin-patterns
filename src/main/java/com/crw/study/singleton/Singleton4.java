package com.crw.study.singleton;

/**
 * 饿汉式 变种 ，与第三种差不多
 */
public class Singleton4 {

    private static Singleton4 instance = null;

    static {
        instance = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
