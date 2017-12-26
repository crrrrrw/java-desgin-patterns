package com.crw.study.chain.example1;

public class Run {

    public static void main(String[] args) {
        AbstractHandler handler1 = new ConcreteHandlerA();
        AbstractHandler handler2 = new ConcreteHandlerB();
        AbstractHandler handler3 = new ConcreteHandlerC();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler1.handleRequest();
        handler2.handleRequest();
        handler3.handleRequest();
    }
}
