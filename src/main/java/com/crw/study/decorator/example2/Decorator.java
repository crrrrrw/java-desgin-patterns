package com.crw.study.decorator.example2;

public class Decorator extends Coffee {

    protected Coffee mCoffee;

    public Decorator(Coffee mCoffee) {
        this.mCoffee = mCoffee;
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice();
    }

    @Override
    public String getName() {
        return mCoffee.getName();
    }
}
