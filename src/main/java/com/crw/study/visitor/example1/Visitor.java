package com.crw.study.visitor.example1;

public interface Visitor {

    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}
