package com.crw.study.observer.example2;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float tempperature;// 温度
    private float humidity;// 湿度
    private Subject weatherData;// 天气数据

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);// 注册观察者
    }

    // 只显示最小，最大，和平均观察值
    public void dispplay() {
        System.out.println("只显示最小，最大，和平均观察值。。。。");
    }

    public void update(float temp, float humidity, float pressure) {
        this.tempperature = temp;
        this.humidity = humidity;
        dispplay();
    }
}
