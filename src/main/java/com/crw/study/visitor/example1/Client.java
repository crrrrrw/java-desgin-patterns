package com.crw.study.visitor.example1;

public class Client {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.addElement(new ConcreteElementA());
        os.addElement(new ConcreteElementB());

        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorB();

        os.accept(visitorA);
        os.accept(visitorB);
    }
}
