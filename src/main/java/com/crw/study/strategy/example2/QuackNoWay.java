package com.crw.study.strategy.example2;

public class QuackNoWay implements QuackBehavior{

    public void quack() {
        System.out.println("寂静中....(不会出声)");
    }
}
