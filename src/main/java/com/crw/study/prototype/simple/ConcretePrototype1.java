package com.crw.study.prototype.simple;

/**
 * 具体原型角色
 */
public class ConcretePrototype1 implements Prototype {

    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1(); // 深拷贝
        return prototype;
    }

}
