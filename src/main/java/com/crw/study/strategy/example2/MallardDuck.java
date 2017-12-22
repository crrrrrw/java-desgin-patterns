package com.crw.study.strategy.example2;

/**
 * 绿头鸭子
 */
public class MallardDuck extends Duck {

    /*public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackGuaGua();
    }*/

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭子！我头是绿色！");
    }
}
