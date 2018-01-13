package com.crw.study.iterator.example1;

import com.crw.study.composite.example2.MenuCompoent;

public class MenuItem extends MenuCompoent {
    String name;
    String descripton;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String descripton, boolean vegetarian, double price) {
        this.name = name;
        this.descripton = descripton;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.descripton;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     --" + getDescription());
    }
}
