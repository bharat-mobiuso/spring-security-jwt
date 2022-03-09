package io.javabrains.springsecurityjwt.models.weather;

public class WeatherOutput {

    private Location location;
    private Condition weatherCondition;

    public WeatherOutput() {
    }

    public WeatherOutput(Location location, Condition weatherCondition) {
        this.location = location;
        this.weatherCondition = weatherCondition;
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

    @Override
    public String toString() {
        return "WeatherOutput{" +
                "location=" + location.toString() +
                ", weatherCondition=" + weatherCondition.toString() +
                '}';
    }
}