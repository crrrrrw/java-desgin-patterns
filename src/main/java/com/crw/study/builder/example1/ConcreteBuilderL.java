package com.crw.study.builder.example1;

public class ConcreteBuilderL implements Builder {

    private String partA;

    private String partB;

    private String partC;


    @Override
    public void buildPartA() {
        this.partA = new String("A");
    }

    @Override
    public void buildPartB() {
        this.partB = new String("B");

    }

    @Override
    public void buildPartC() {
        this.partC = new String("C");
    }

    @Override
    public Product getProduct() {
        return new Product(partA, partB, partC);
    }
}
