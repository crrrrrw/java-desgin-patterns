package com.crw.study.proxy.example2;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real business...");
    }
}
