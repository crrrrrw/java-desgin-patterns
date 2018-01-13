package com.crw.study.decorator.example2;

public class Run {

    public static void main(String[] args) {
        Coffee coffee = new MilkDecorator(new MochaDecorator(new WhipDecorator(new BaseCoffee())));
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Coffee coffee2 = new MochaDecorator(new WhipDecorator(new BaseCoffee()));
        System.out.println(coffee2.getName());
        System.out.println(coffee2.getPrice());
    }
}
