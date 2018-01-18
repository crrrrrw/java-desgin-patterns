package com.crw.study.prototype.simple;

/**
 * 客户端角色
 */
public class Client {

    public static void main(String[] args) {
        Prototype obj1 = new ConcretePrototype1().clone();
        Prototype obj2 = new ConcretePrototype2().clone();
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
