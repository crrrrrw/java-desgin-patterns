package com.crw.study.state.example2;

//实现状态接口
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    //通过构造器，得到糖果机的引用
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}
