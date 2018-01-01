package com.crw.study.builder.example1;

public class Run {

    public static void main(String[] args) {
        ConcreteBuilderL buildL = new ConcreteBuilderL();
        Director director = new Director(buildL);
        director.build();
        System.out.println(buildL.getProduct().toString());

        ConcreteBuilderU builderU = new ConcreteBuilderU();
        Director director2 = new Director(builderU);
        director2.build();
        System.out.println(builderU.getProduct().toString());
    }
}
