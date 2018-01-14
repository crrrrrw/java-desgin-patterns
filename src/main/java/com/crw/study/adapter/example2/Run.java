package com.crw.study.adapter.example2;

public class Run {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey); // generate a turkey-like duck
        turkeyAdapter.fly();
        turkeyAdapter.quack();
    }
}
