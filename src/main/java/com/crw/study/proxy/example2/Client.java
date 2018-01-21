package com.crw.study.proxy.example2;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class Client {

    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject(); // 真实角色
        ProxyHandler proxyHandler = new ProxyHandler(realSubject); // 处理器
        Subject proxy = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(), proxyHandler);// 代理类
//        Subject proxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
//                new Class[]{Subject.class}, proxyHandler); // 代理类
        proxy.request();
    }
}
