package com.crw.study.prototype.simple2;

/**
 * 客户端角色
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype obj1 = (Prototype) new ConcretePrototype1().clone();
        Prototype obj2 = (Prototype) new ConcretePrototype2().clone();
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}
