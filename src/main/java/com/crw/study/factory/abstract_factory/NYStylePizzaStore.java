package com.crw.study.factory.abstract_factory;


public class NYStylePizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();// 到纽约原料工厂获取原料
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equals("pepperoni")) {
            pizza = null;
        } else if (item.equals("clam")) {
            pizza = null;
        } else if (item.equals("veggie")) {
            pizza = null;
        }

        return pizza;
    }
}

