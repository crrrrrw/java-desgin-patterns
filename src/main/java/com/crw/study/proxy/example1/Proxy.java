package com.crw.study.proxy.example1;

public class Proxy implements Subject {
    Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("proxy do something1...");
        realSubject.request();
        System.out.println("proxy do something2...");
    }
}
