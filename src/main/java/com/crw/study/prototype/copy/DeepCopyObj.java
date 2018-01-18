package com.crw.study.prototype.copy;

import java.util.Date;

/**
 * 原型模式:深克隆
 * Cloneable是一个空接口（标记接口），是一个规范。但是如果要克隆这个类对象的话必须实现Cloneable接口
 */
public class DeepCopyObj implements Cloneable {

    private String name;
    private int age;
    private Date birthday;

    /**
     * 重写Object对象的clone方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object对象的clone方法
        DeepCopyObj obj = (DeepCopyObj) super.clone();
        //深克隆：把对象下的所有属性也克隆出来
        obj.birthday = (Date) this.birthday.clone();
        return obj;
    }

    public DeepCopyObj(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "ShallowCopyObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
