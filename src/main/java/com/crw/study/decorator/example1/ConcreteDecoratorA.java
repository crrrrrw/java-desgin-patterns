package com.crw.study.decorator.example1;

public class ConcreteDecoratorA implements Decorator {
    Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

    // 添加新方法
    public void newBehaviorA() {
        System.out.println("A --> do other things...");
    }
}
