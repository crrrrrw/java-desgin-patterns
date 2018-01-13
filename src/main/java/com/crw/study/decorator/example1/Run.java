package com.crw.study.decorator.example1;

public class Run {

    public static void main(String[] args) {
        Component component = new ConcreteCompontent();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);

        concreteDecoratorA.operation();
        concreteDecoratorA.newBehaviorA();

        System.out.println("-----------");

        concreteDecoratorB.operation();
        concreteDecoratorB.newBehaviorB();
    }
}
