package com.crw.study.state.example1;

public class Client {

    public static void main(String[] args) {
        ConcreteStateA stateA = new ConcreteStateA();
        ConcreteStateB stateB = new ConcreteStateB();
        Context context = new Context(stateA);
        context.request();
        context.setState(stateB);
        context.request();
    }
}
