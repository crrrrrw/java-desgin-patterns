package com.crw.study.strategy.example2;

import com.crw.study.strategy.example1.ConcreteStrategyA;
import com.crw.study.strategy.example1.ConcreteStrategyB;
import com.crw.study.strategy.example1.ConcreteStrategyC;
import com.crw.study.strategy.example1.Context;

/**
 *
 */
public class Run {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.swim();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new QuackGuaGua());
        duck1.performFly();
        duck1.performQuack();
        System.out.println("==================");

        Duck duck2 = new RedHeadDuck();
        duck2.display();
        duck2.swim();
        duck2.setFlyBehavior(new FlyWithWings());
        duck2.setQuackBehavior(new QuackSqueak());
        duck2.performFly();
        duck2.performQuack();
        System.out.println("==================");

        Duck duck3 = new RubberDuck();
        duck3.display();
        duck3.swim();
        duck3.setFlyBehavior(new FlyNoWay());
        duck3.setQuackBehavior(new QuackNoWay());
        duck3.performFly();
        duck3.performQuack();
    }
    /*
     输出：
     我是一只绿头鸭子！我头是绿色！
     所有的鸭子都会游泳！
     我用翅膀飞行！
     呱呱叫！
     ==================
     我是一只红头鸭！我头是红色！
     所有的鸭子都会游泳！
     我用翅膀飞行！
     吱吱叫！
     ==================
     我是一只橡皮鸭子！
     所有的鸭子都会游泳！
     我不会飞行！
     寂静中....(不会出声)
     */
}
