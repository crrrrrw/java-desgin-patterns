package com.crw.study.iterator.example1;

import com.crw.study.composite.example2.MenuCompoent;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n--------\nBREAKFAST");
        this.printMenu(pancakeHouseMenuIterator);
        System.out.println("\nDINNER");
        this.printMenu(dinnerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ",  ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
