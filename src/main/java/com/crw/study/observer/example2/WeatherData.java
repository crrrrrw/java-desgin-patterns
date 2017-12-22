package com.crw.study.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float tempperature;// 温度
    private float humidity;// 湿度
    private float pressure;// 气压

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(tempperature, humidity, pressure);
        }
    }

    /**
     * 有变化是通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float tempperature, float humidity, float pressure) {
        this.tempperature = tempperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
