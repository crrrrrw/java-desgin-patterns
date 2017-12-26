package com.crw.study.chain.example1;


public class ConcreteHandlerB extends AbstractHandler {

    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        if (getSuccessor() != null) {
            getSuccessor().handleRequest();
        } else {
            System.out.println("处理器实现B 处理请求...");
        }
    }
}
