package com.crw.study.state.example2;

public class Client {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10);
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        //再在转动执行多次
    }
}
