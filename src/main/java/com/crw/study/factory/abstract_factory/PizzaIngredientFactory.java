package com.crw.study.factory.abstract_factory;

public interface PizzaIngredientFactory {

    Sause createSause();

    Cheese createCheese();

    Veggies[] createVeggies();

    Clam createClam();
}
