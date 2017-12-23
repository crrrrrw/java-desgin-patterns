package com.crw.study.factory.factory_method;

/**
 *
 */
public class Run {

    /**
     * 业务上，增加了加盟商，纽约风味披萨 和 芝加哥风味披萨 都需要有各种披萨类型。
     */
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new NYStylePizzaStore();
        Pizza pizza1 = pizzaStore1.orderPizza("cheese");
        System.out.println(pizza1.getClass().getName());
        System.out.println("====================");
        PizzaStore pizzaStore2 = new ChicagoStylePizzaStore();
        Pizza pizza2 = pizzaStore2.orderPizza("clam");
        System.out.println(pizza2.getClass().getName());
    }
}
