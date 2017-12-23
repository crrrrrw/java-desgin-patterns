package com.crw.study.factory.abstract_factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Sause createSause() {
        return null;
    }

    public Cheese createCheese() {
        return null;
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Clam createClam() {
        return null;
    }
}
