package com.crw.study.composite.example2;

public class Waitress {
    MenuCompoent allMenus;

    public Waitress(MenuCompoent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
