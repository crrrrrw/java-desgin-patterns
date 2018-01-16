package com.crw.study.template.example1;

public class ConcreteTemplateA extends AbstractTemplate {
    //基本方法的实现
    @Override
    public void abstractMethod() {
        //业务相关的代码
        System.out.println(getClass().getName() + " ...");
    }

    //重写父类的方法
    @Override
    public void hookMethod() {
        //业务相关的代码
    }
}
