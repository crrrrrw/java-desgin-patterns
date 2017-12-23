package com.crw.study.factory.abstract_factory;

public class ClamPizza extends Pizza {
    // Pizza原料工厂
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("preparing " + name);
        sause = ingredientFactory.createSause();
        clam = ingredientFactory.createClam();
    }
}
