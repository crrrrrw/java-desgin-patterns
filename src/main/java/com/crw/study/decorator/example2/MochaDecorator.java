package com.crw.study.decorator.example2;

public class MochaDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     */
    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 15;
    }

    @Override
    public String getName() {
        return mCoffee.getName() + " add mocha";
    }
}