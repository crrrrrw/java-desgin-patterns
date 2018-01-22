package com.crw.study.bridge.example1;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void handle() {
        implementor.operation();
    }
}
