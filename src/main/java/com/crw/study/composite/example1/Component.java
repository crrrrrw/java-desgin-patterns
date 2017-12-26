package com.crw.study.composite.example1;

import java.util.List;

/**
 * 抽象构件接口
 */
public abstract class Component {
    public abstract void doSomething();

    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    public void removeChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    public Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    public List<Component> getAll() {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
