package com.crw.study.chain.example1;

/**
 * 抽象处理器
 */
public abstract class AbstractHandler {
    /**
     * 持有后继的责任对象
     */
    protected AbstractHandler successor;

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数的
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();

    /**
     * 取值方法
     */
    public AbstractHandler getSuccessor() {
        return successor;
    }

    /**
     * 赋值方法，设置后继的责任对象
     */
    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }
}
