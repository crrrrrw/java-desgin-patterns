package com.crw.study.proxy.example1;

/**
 * 静态代理
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Subject subject = new Proxy(realSubject);
        subject.request();
    }
}
