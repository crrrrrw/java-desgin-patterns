package com.crw.study.observer.example2;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float tempperature;// 温度
    private float humidity;// 湿度
    private Subject weatherData;// 天气数据

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);// 注册观察者
    }

    // 只显示温度和湿度
    public void dispplay() {
        System.out.println("当前状况：" + tempperature + "F degrees," + humidity + "% 湿度");
    }

    public void update(float temp, float humidity, float pressure) {
        this.tempperature = temp;
        this.humidity = humidity;
        dispplay();
    }
}
