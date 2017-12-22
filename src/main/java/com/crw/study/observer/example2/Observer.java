package com.crw.study.observer.example2;

/**
 * 抽象光观察者
 */
public interface Observer {
    // 更新气象元素
    void update(float temp, float humidity, float pressure);
}
