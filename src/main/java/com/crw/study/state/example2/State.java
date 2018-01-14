package com.crw.study.state.example2;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}