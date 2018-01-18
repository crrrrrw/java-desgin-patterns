package com.crw.study.prototype.copy;

import java.io.*;
import java.util.Date;

/**
 * 利用序列化和反序列化实现深克隆
 */
public class SerializeCopyClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeCopyObj obj = new SerializeCopyObj("原型对象", 23, new Date(1516256879566L));
        System.out.println("原型对象:" + obj);


        //使用序列化和反序列化实现深复制
        //1、将 obj 对象序列化为一个数组
        //通过ObjectOutputStream流将s1对象读出来给ByteArrayOutputStream流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
        //ByteArrayOutputStream流将对象信息转成byte数组，这样byte数组里就包含了对象的数据
        byte[] bytes = bos.toByteArray();

        //2、将字节数组中的内容反序列化为一个Sheep对象
        //通过ByteArrayInputStream流读入bytes字节数组中数据，然后传给ObjectInputStream对象输入流
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        //通过ObjectInputStream返回一个Sheep对象
        SerializeCopyObj clone = (SerializeCopyObj) ois.readObject();
        System.out.println("克隆对象:" + clone);

        System.out.println("\n开始修改原型对象...\n");
        obj.setAge(25);
        obj.setName("原型对象名称修改");
        obj.setBirthday(new Date(1556256879566L));

        System.out.println("修改后原型对象的原型对象:" + obj);
        System.out.println("修改后原型对象的克隆对象:" + clone);
    }
    /*
    输出：
    原型对象:ShallowCopyObj{name='原型对象', age=23, birthday=Thu Jan 18 14:27:59 CST 2018}
    克隆对象:ShallowCopyObj{name='原型对象', age=23, birthday=Thu Jan 18 14:27:59 CST 2018}

    开始修改原型对象...

    修改后原型对象的原型对象:ShallowCopyObj{name='原型对象名称修改', age=25, birthday=Fri Apr 26 13:34:39 CST 2019}
    修改后原型对象的克隆对象:ShallowCopyObj{name='原型对象', age=23, birthday=Thu Jan 18 14:27:59 CST 2018}
     */
}
