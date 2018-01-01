package com.crw.study.builder.example1;

public class ConcreteBuilderU implements Builder {

    private String partA;

    private String partB;

    private String partC;


    @Override
    public void buildPartA() {
        this.partA = new String("a");
    }

    @Override
    public void buildPartB() {
        this.partB = new String("b");

    }

    @Override
    public void buildPartC() {
        this.partC = new String("c");
    }

    @Override
    public Product getProduct() {
        return new Product(partA, partB, partC);
    }
}
