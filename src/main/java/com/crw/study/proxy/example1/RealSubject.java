package com.crw.study.proxy.example1;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real business...");
    }
}
