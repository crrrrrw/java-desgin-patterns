package com.crw.study.factory.factory_method;

public abstract class Pizza {
    // 增加一些属性
    String name;
    double dough;
    String sause;

    public Pizza() {
    }

    public Pizza(String name, double dough, String sause) {
        this.name = name;
        this.dough = dough;
        this.sause = sause;
    }

    public void prepare() {
        System.out.println("preparing " + name);
        System.out.println("tossing dough " + dough);
        System.out.println("add sause " + sause);
        System.out.println("prepare pizza...");
    }

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
