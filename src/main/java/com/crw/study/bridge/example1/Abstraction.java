package com.crw.study.bridge.example1;

public abstract class Abstraction {
    Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void handle() {

    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
