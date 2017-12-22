package com.crw.study.observer.example2;

public class Run {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.2f);
        weatherData.setMeasurements(87, 60, 29f);
        weatherData.setMeasurements(76, 76, 39.5f);
    }
    /*
    输出：
    当前状况：80.0F degrees,65.0% 湿度
    只显示最小，最大，和平均观察值。。。。
    只显示天气预报。。。。
    当前状况：87.0F degrees,60.0% 湿度
    只显示最小，最大，和平均观察值。。。。
    只显示天气预报。。。。
    当前状况：76.0F degrees,76.0% 湿度
    只显示最小，最大，和平均观察值。。。。
    只显示天气预报。。。。
     */
}
