package io.javabrains.springsecurityjwt.models.covid;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties
public class Country {

    @JsonProperty("updated")
    private long updatedTime;

    @JsonProperty("country")
    private String countryName;

    @JsonProperty("cases")
    private long totalCases;

    @JsonProperty("todayCases")
    private long todayCases;

    @JsonProperty("deaths")
    private long totalDeaths;

    @JsonProperty("todayDeaths")
    private long todayDeaths;

    @JsonProperty("recovered")
    private long totalRecovered;

    @JsonProperty("todayRecovered")
    private long todayRecovered;

    @JsonProperty("active")
    private long activeCases;

    @JsonProperty("critical")
    private long criticalCases;

    @JsonProperty("population")
    private long population;

    public String getUpdatedTime() {
        return new Date(updatedTime).toString();
    }

    public void setUpdatedTime(long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(long totalCases) {
        this.totalCases = totalCases;
    }

    public long getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(long todayCases) {
        this.todayCases = todayCases;
    }

    public long getTotalDeaths() {
        return totalDeaths;
    }

    public void setTotalDeaths(long totalDeaths) {
        this.totalDeaths = totalDeaths;
    }

    public long getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(long todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public long getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(long totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public long getTodayRecovered() {
        return todayRecovered;
    }

    public void setTodayRecovered(long todayRecovered) {
        this.todayRecovered = todayRecovered;
    }

    public long getActiveCases() {
        return activeCases;
    }

    public void setActiveCases(long activeCases) {
        this.activeCases = activeCases;
    }

    public long getCriticalCases() {
        return criticalCases;
    }

    public void setCriticalCases(long criticalCases) {
        this.criticalCases = criticalCases;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
