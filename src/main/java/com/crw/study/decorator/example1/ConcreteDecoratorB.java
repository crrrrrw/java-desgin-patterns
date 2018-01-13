package com.crw.study.decorator.example1;

public class ConcreteDecoratorB implements Decorator {
    Component component;

    Object newState;// 添加新状态

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

    // 添加新方法
    public void newBehaviorB() {
        newState = "preparing";
        System.out.println("B --> do other things...");
        System.out.println("state:" + newState);
    }
}
