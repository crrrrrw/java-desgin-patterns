package com.crw.study.proxy.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class ProxyHandler implements InvocationHandler {
    private Subject realSubject;

    public ProxyHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = null;// 代理对象
        System.out.println("proxy do something1...");
        if ("request".equalsIgnoreCase(method.getName())) {
            method.invoke(realSubject, args);
        }
        System.out.println("proxy do something2...");
        return obj;
    }
}
