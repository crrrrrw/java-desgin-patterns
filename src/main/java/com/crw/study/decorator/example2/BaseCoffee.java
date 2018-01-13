package com.crw.study.decorator.example2;

public class BaseCoffee extends Coffee {
    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getName() {
        return "base coffee";
    }
}
