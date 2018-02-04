package com.crw.study.visitor.example1;

public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println(this.getClass().getSimpleName() + " access " + concreteElementA.getClass().getSimpleName());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println(this.getClass().getSimpleName() + " access " + concreteElementB.getClass().getSimpleName());
    }
}
