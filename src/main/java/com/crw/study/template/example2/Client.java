package com.crw.study.template.example2;

public class Client {

    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("\n Making Coffee...");
        coffee.prepareRecipe();

        System.out.println("\n Making Tea...");
        tea.prepareRecipe();

        CaffeineBeverageWithHook teaWithHook = new TeaWithHook();
        System.out.println("\n Making Tea...");
        teaWithHook.prepareRecipe();
    }
}
