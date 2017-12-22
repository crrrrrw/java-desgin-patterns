package com.crw.study.observer.example3;

import com.crw.study.observer.example2.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * 使用java内置的观察者
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {//1.实现接口

    private float tempperature;// 温度
    private float humidity;// 湿度
    private Observable observable;// 2.使用java内置的主题

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);// 3.注册观察者
    }

    // 只显示温度和湿度
    public void dispplay() {
        System.out.println("当前状况：" + tempperature + "F degrees," + humidity + "% 湿度");
    }

    // 4.实现java的update方法
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.tempperature = weatherData.getTempperature();
            this.humidity = weatherData.getHumidity();
            dispplay();
        }
    }
}
