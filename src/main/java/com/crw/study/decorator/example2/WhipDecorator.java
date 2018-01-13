package com.crw.study.decorator.example2;

public class WhipDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     */
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 8;
    }

    @Override
    public String getName() {
        return mCoffee.getName() + " add whip";
    }
}