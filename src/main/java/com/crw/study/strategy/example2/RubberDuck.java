package com.crw.study.strategy.example2;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {

    /*public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackNoWay();
    }*/

    @Override
    public void display() {
        System.out.println("我是一只橡皮鸭子！");
    }
}
