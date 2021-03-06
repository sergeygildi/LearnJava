package com.headfirst.desingpatterns.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(85, 80, 30.5f);
    }
}
