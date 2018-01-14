package com.crw.study.state.example2;

public class SoldState implements State {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    // 投入25分钱
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    // 拒绝25分钱
    public void ejectQuarter() {
        System.out.println("Sorry,you have already turn crank");
    }

    // 转动曲柄
    public void turnCrank() {
        System.out.println("trun twice ,doesn't give you anthor gamball!");
    }

    // 发放糖果
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Opps,out of gamball!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
