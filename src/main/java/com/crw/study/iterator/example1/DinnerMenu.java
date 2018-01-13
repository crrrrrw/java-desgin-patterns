package com.crw.study.iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        this.addItem("热狗", "热腾腾的热狗！", false, 5.89);
        this.addItem("肉夹馍", "中式热狗！", false, 6.5);
        this.addItem("南瓜粥", "很养胃，很甜！", true, 3.4);
        this.addItem("兰州拉面", "劲道的面！", false, 8.9);

    }

    private void addItem(String name, String descripton, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, descripton, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("sorry, 不能再添加菜了");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    Iterator createIterator() {
        return new DinnerMenuIterator(menuItems);
    }
}
