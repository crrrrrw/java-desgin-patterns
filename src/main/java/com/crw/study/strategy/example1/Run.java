package com.crw.study.strategy.example1;

/**
 *
 */
public class Run {

    public static void main(String[] args) {
        Context context1 = new Context(new ConcreteStrategyA());
        context1.contextInterface();


        Context context2 = new Context(new ConcreteStrategyB());
        context2.contextInterface();


        Context context3 = new Context(new ConcreteStrategyC());
        context3.contextInterface();
    }
}
