package com.crw.study.state.example1;

/**
 * 上下文
 * 它可以拥有一些内部状态
 */
public class Context {

    State state;

    public Context(State state) {
        this.state = state;
    }

    /**
     * 只要有人调用request方法，它就会被委托到状态来处理
     */
    public void request() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }
}
