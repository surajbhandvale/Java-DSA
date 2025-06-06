package com.examples.array;

public class Weather {
    private String place;
    private double temperature;

    public Weather(String place, double temperature) {
        this.place = place;
        this.temperature = temperature;
    }

    public String getPlace() {
        return place;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return place + " - " + temperature + "°C";
    }
}
