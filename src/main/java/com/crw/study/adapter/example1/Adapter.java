package com.crw.study.adapter.example1;

public class Adapter implements Target {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("do something...");
        adaptee.specificRequest();
    }
}
