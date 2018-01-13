package com.crw.study.decorator.example2;

/**
 * 这里Coffee相当于我们的Component，
 * 是要装饰的类
 */
public abstract class Coffee {

    public abstract int getPrice();

    public abstract String getName();
}
