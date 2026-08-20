package com.main.entity;

public class WeatherResponse {

    private String city;
    private String temperature;
    private String condition;

    public WeatherResponse() {
    }

    public WeatherResponse(String city, String temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "WeatherResponse{" +
                "city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}