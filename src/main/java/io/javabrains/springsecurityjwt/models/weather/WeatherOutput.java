package io.javabrains.springsecurityjwt.models.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherOutput {

    private String lastUpdated;
    private int temperatureC;
    private int temperatureF;
    private Boolean isDay;

    private Location location;
    private Condition weatherCondition;

    public WeatherOutput() {
    }

    public WeatherOutput(Location location, Condition weatherCondition, String lastUpdated, int temperatureC, int temperatureF, Boolean isDay) {
        this.location = location;
        this.weatherCondition = weatherCondition;
        this.lastUpdated = lastUpdated;
        this.temperatureC = temperatureC;
        this.temperatureF = temperatureF;
        this.isDay = isDay;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Condition getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(Condition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public int getTemperatureC() {
        return temperatureC;
    }

    public void setTemperatureC(int temperatureC) {
        this.temperatureC = temperatureC;
    }

    public int getTemperatureF() {
        return temperatureF;
    }

    public void setTemperatureF(int temperatureF) {
        this.temperatureF = temperatureF;
    }

    public Boolean getDay() {
        return isDay;
    }

    public void setDay(Boolean day) {
        isDay = day;
    }

    @Override
    public String toString() {
        return "WeatherOutput{" +
                "location=" + location.toString() +
                ", weatherCondition=" + weatherCondition.toString() +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", temperatureC=" + temperatureC +
                ", temperatureF=" + temperatureF +
                ", isDay=" + isDay +
                '}';
    }
}