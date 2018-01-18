package com.crw.study.prototype.register;

/**
 * 客户端调用
 */
public class Client {

    public static void main(String[] args) throws Exception {
        // 1.创建并注册一个原型
        Prototype obj = new ConcretePrototype1();
        PrototypeManager.setPrototype("obj", obj);

        // 2.获取原型来创建对象
        Prototype p1 = PrototypeManager.getPrototype("obj").clone();
        p1.setName("张三");
        System.out.println("第一个实例：" + p1);

        // 3.有人动态的切换了实现
        Prototype obj2 = new ConcretePrototype2();
        PrototypeManager.setPrototype("obj", obj2);

        // 4.重新获取原型来创建对象
        Prototype p2 = PrototypeManager.getPrototype("obj").clone();
        p2.setName("李四");
        System.out.println("第二个实例：" + p2);

        // 5.有人注销了这个原型
        PrototypeManager.removePrototype("obj");

        // 6.再次获取原型来创建对象
        Prototype p3 = PrototypeManager.getPrototype("obj").clone();
        p3.setName("王五");
        System.out.println("第三个实例：" + p3);


    }
}
