package com.crw.study.decorator.example2;

public class MilkDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 10;
    }

    @Override
    public String getName() {
        return mCoffee.getName() + " add milk";
    }
}