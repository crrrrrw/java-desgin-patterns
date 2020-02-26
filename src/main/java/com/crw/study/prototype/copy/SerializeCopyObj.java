package com.crw.study.prototype.copy;

import java.io.*;
import java.util.Date;

/**
 * 实现序列化接口
 */
public class SerializeCopyObj implements Serializable, Cloneable {

    private String name;
    private int age;
    private Date birthday;

    public SerializeCopyObj(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {

            //1、将 obj 对象序列化为一个数组
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //ByteArrayOutputStream流将对象信息转成byte数组，这样byte数组里就包含了对象的数据
            byte[] bytes = bos.toByteArray();

            //2、将字节数组中的内容反序列化为对象
            //通过ByteArrayInputStream流读入bytes字节数组中数据，然后传给ObjectInputStream对象输入流
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);
            //通过ObjectInputStream返回一个Sheep对象
            return ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
