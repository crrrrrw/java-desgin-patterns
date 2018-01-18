package com.crw.study.prototype.register;

/**
 * 抽象原型角色
 */
public interface Prototype {

    Prototype clone();

    String getName();

    void setName(String name);
}
