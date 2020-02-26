package com.crw.study.mediator.example1;

/**
 * 中介者
 */
public interface Mediator {

    //注册同事
    void register(Colleague colleague);

    //通知中介者，发送消息
    void relay(Colleague colleague);

}
