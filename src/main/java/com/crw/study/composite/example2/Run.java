package com.crw.study.composite.example2;

/**
 * 菜单测试
 */
public class Run {

    public static void main(String[] args) {
        // 创建菜单
        MenuCompoent menu1 = new Menu("蛋糕屋菜单", "早餐");
        MenuCompoent menu2 = new Menu("餐车菜单", "午餐");
        MenuCompoent menu3 = new Menu("咖啡菜单", "晚餐");
        MenuCompoent menu4 = new Menu("甜品菜单", "甜点");

        MenuCompoent allMenus = new Menu("总菜单", "所有的菜单汇总");

        allMenus.add(menu1);
        allMenus.add(menu2);
        allMenus.add(menu3);

        menu3.add(new MenuItem("麻辣烫", "有点辣，有点麻", false, 15.6));
        menu3.add(menu4);

        menu4.add(new MenuItem("苹果派", "真的是苹果味的！", true, 2.5));

        // 报菜
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }

}
