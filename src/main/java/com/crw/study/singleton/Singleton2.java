package com.crw.study.singleton;

/**
 * 懒汉，线程安全，效率低
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
