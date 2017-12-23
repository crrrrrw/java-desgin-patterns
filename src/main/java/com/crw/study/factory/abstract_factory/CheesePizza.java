package com.crw.study.factory.abstract_factory;

public class CheesePizza extends Pizza {
    // Pizza原料工厂
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("preparing " + name);
        sause = ingredientFactory.createSause();
        cheese = ingredientFactory.createCheese();
    }
}
