package com.crw.study.factory.abstract_factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String item) {
        Pizza pizza = this.createPizza(item);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract com.crw.study.factory.abstract_factory.Pizza createPizza(String item);
}
