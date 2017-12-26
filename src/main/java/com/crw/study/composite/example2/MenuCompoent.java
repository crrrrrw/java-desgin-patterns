package com.crw.study.composite.example2;

public abstract class MenuCompoent {

    public void add(MenuCompoent child) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuCompoent child) {
        throw new UnsupportedOperationException();
    }

    public MenuCompoent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
