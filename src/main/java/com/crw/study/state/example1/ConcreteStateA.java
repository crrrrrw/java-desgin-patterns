package com.crw.study.state.example1;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("state A...");
    }
}
