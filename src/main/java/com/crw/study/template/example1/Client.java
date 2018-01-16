package com.crw.study.template.example1;

public class Client {

    public static void main(String[] args) {
        AbstractTemplate templateA = new ConcreteTemplateA();
        AbstractTemplate templateB = new ConcreteTemplateB();

        templateA.templateMethod();
        templateB.templateMethod();
    }
}
