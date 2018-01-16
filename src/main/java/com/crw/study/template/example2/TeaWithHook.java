package com.crw.study.template.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    void addCondiments() {//加柠檬
        System.out.println("Add lemon");
    }

    void brew() {//用沸水浸泡茶叶
        System.out.println("Steep Tea Bag");
    }

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        //让子类可以决定算法是否执行该步骤
        //customerWantsCondiments()方法是一个钩子，父类对其其默认实现返回true，即默认执行步骤(4)
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public boolean customerWantsCondiments() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like lemon  with your tea (y/n) ? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }
        if ("no".equalsIgnoreCase(answer)) {
            return "no";
        }
        return answer;
    }

}
