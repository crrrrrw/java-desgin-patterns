package com.crw.study.factory.factory_method;

public abstract class PizzaStore {//1.声明为抽象的
    // SimplePizzaFactory factory; // 2.删除单一的简单工厂

    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);//4.调用抽象方法

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);// 3.创建抽象方法
}
