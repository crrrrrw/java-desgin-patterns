package com.crw.study.state.example2;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("gumball machine was sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("gumball machine was sold out");
    }

    @Override
    public void dispense() {
        System.out.println("gumball machine was sold out, there were no candies");
    }
}
