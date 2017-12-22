package com.crw.study.observer.example3;

import com.crw.study.observer.example2.Observer;
import com.crw.study.observer.example2.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * 使用java内置的主题接口
 */
public class WeatherData extends Observable {// 1.继承，删除之前自定义的注册删除方法
    private float tempperature;// 温度
    private float humidity;// 湿度
    private float pressure;// 气压

    public WeatherData() { //2.无参构造器
    }

    /**
     * 有变化是通知观察者
     */
    public void measurementsChanged() {
        setChanged();// 3.调用notifyObservers()前指示状态已改变
        notifyObservers();
    }

    public void setMeasurements(float tempperature, float humidity, float pressure) {
        this.tempperature = tempperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 4.增加 getter
     */
    public float getTempperature() {
        return tempperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
