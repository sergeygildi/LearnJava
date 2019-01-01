package com.headfirst.desingpatterns.SecondExample;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementsChanges() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanges();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
