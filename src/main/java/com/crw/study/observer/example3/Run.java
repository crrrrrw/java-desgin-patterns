package com.crw.study.observer.example3;

public class Run {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.2f);
        weatherData.setMeasurements(87, 60, 29f);
        weatherData.setMeasurements(76, 76, 39.5f);
    }
    /*
    输出：
    当前状况：80.0F degrees,65.0% 湿度
    当前状况：87.0F degrees,60.0% 湿度
    当前状况：76.0F degrees,76.0% 湿度
     */
}
