package com.crw.study.factory.abstract_factory;

public class Run {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getClass().getName());
    }
}
