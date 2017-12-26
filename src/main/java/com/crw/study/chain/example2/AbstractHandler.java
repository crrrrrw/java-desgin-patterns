package com.crw.study.chain.example2;

/**
 * 抽象处理器
 */
public abstract class AbstractHandler {

    protected AbstractHandler successor;

    public abstract String handleRequest(FeeRequest feeRequest);

    public AbstractHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }
}
