package com.crw.study.factory.abstract_factory;

public abstract class Pizza {
    // 增加一些属性
    String name;
    double dough;

    // 1.有增加了一些属性，这些属性又各自有自己的产品家族
    Veggies[] veggies;
    Sause sause;
    Cheese cheese;
    Clam clam;
    Pepperoni pepperoni;

    public Pizza() {
    }

    abstract void prepare();// 2.声明为抽象的，这个方法中收集需要的原料。

    public void bake() {
        System.out.println("bake pizza...");
    }

    public void cut() {
        System.out.println("cut pizza...");
    }

    public void box() {
        System.out.println("box pizza...");
    }
}
