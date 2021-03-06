package com.crw.study.prototype.copy;


import java.util.Date;

public class DeepCopyClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopyObj obj = new DeepCopyObj("原型对象", 23, new Date(1516256879566L));
        System.out.println("原型对象:" + obj);

        DeepCopyObj clone = (DeepCopyObj) obj.clone();
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
