package com.crw.study.observer.example2;

/**
 * 抽象主题
 */
public interface Subject {
    // 增加观察者
    void register(Observer observer);

    // 删除观察者
    void remove(Observer observer);

    // 通知所有的观察者
    void notifyObservers();
}
