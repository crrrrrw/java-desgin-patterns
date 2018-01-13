package com.crw.study.iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<>();
        this.addItem("苹果派", "真的是苹果味！", false, 3.14);
        this.addItem("菠萝派", "真的是菠萝味！", false, 4.23);
        this.addItem("榴莲派", "真的是榴莲味！", false, 5.66);
        this.addItem("蔬菜沙拉", "有很多蔬菜！", true, 3.67);

    }

    private void addItem(String name, String descripton, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, descripton, vegetarian, price);
        menuItems.add(menuItem);
    }

    Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
