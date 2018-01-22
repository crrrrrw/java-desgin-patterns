package com.crw.study.bridge.example1;

public class Client {

    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstraction = new RefinedAbstraction(implementorA);
        abstraction.handle();

        abstraction.setImplementor(implementorB);
        abstraction.handle();
    }
}
