package com.crw.study.composite.example2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuCompoent {
    List<MenuCompoent> menuCompoents = new ArrayList<MenuCompoent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuCompoent child) {
        menuCompoents.add(child);
    }

    @Override
    public void remove(MenuCompoent child) {
        menuCompoents.remove(child);
    }

    @Override
    public MenuCompoent getChild(int index) {
        return menuCompoents.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");

        // 递归打印
        Iterator<MenuCompoent> iterator = menuCompoents.iterator();
        while (iterator.hasNext()) {
            MenuCompoent next = iterator.next();
            next.print();
        }
    }
}
