package com.crw.study.chain.example2;

public class Run {

    public static void main(String[] args) {
        //先要组装责任链
        AbstractHandler h1 = new GeneralManagerHandler();
        AbstractHandler h2 = new DeptManagerHandler();
        AbstractHandler h3 = new ProjectManagerHandler();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String test1 = h3.handleRequest(new FeeRequest("张三", 300));
        System.out.println("test1 = " + test1);
        String test2 = h3.handleRequest(new FeeRequest("李四", 300));
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = h3.handleRequest(new FeeRequest("张三", 700));
        System.out.println("test3 = " + test3);
        String test4 = h3.handleRequest(new FeeRequest("李四", 700));
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = h3.handleRequest(new FeeRequest("张三", 1500));
        System.out.println("test5 = " + test5);
        String test6 = h3.handleRequest(new FeeRequest("李四", 1500));
        System.out.println("test6 = " + test6);
    }

}
