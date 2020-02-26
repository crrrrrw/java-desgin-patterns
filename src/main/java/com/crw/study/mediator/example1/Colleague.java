package com.crw.study.mediator.example1;

/**
 * 同事类
 */
public abstract class Colleague {

    //中介者抽象类
    protected Mediator mediator;

    public abstract void receive();

    public abstract void send();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
