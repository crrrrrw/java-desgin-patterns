package com.crw.study.state.example1;

public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("state B...");
    }
}
