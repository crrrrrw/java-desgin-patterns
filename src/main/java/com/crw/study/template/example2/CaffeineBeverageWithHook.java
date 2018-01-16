package com.crw.study.template.example2;

/**
 * 有钩子的抽象模板
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();//把水煮沸
        brew();//用热水泡咖啡或茶
        pourInCup();//把饮料（咖啡或茶）倒进杯子
        if (customerWantsCondiments()) {
            addCondiments();//加入调料
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}