package com.crw.study.observer.example2;

public class ForecastDisplay implements Observer, DisplayElement {

    private float tempperature;// 温度
    private float humidity;// 湿度
    private Subject weatherData;// 天气数据

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);// 注册观察者
    }

    // 只显示天气预报
    public void dispplay() {
        System.out.println("只显示天气预报。。。。");
    }

    public void update(float temp, float humidity, float pressure) {
        this.tempperature = temp;
        this.humidity = humidity;
        dispplay();
    }
}
