package com.crw.study.prototype.simple2;

/**
 * 抽象原型角色
 */
public abstract class Prototype implements Cloneable {
    /**
     * 调用 Object类 的clone()方法，浅拷贝
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
