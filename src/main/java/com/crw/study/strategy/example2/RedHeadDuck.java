package com.crw.study.strategy.example2;

/**
 * 红头鸭
 */
public class RedHeadDuck extends Duck {

    /*public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackSqueak();
    }*/

    @Override
    public void display() {
        System.out.println("我是一只红头鸭！我头是红色！");
    }
}
