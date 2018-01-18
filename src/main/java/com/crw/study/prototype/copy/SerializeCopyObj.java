package com.crw.study.prototype.copy;

import java.io.Serializable;
import java.util.Date;

/**
 * 实现序列化接口
 */
public class SerializeCopyObj implements Serializable {

    private String name;
    private int age;
    private Date birthday;

    public SerializeCopyObj(String name, int age, Date birthday) {
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
