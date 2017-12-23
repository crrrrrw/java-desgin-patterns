package com.crw.study.factory.simple_factory;

/**
 * 下面我们从开闭原则（对扩展开放；对修改封闭）上来分析下简单工厂模式。当客户不再满足现有的Pizza的时候，
 * 想要一种新型Pizza，只要这种Pizza符合抽象产品制定的合同，那么只要通知工厂类知道就可以被客户使用了。
 * 所以对产品部分来说，它是符合开闭原则的；但是工厂部分好像不太理想，因为每增加一种新型Pizza，都要在工厂类中
 * 增加相应的创建业务逻辑（createPizza(String type)方法需要新增case），这显然是违背开闭原则的。可想而知对于
 * 新产品的加入，工厂类是很被动的。对于这样的工厂类，我们称它为全能类或者上帝类。
 * 我们举的例子是最简单的情况，而在实际应用中，很可能产品是一个多层次的树状结构。
 * 由于简单工厂模式中只有一个工厂类来对应这些产品，所以这可能会把我们的上帝累坏了，也累坏了我们这些程序员。
 */
public class Run {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getClass().getName());
    }
}
