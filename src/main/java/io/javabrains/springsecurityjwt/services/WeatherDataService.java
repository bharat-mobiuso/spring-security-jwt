package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.models.weather.Weather;
import io.javabrains.springsecurityjwt.models.weather.WeatherOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherDataService {

    private Logger log = LoggerFactory.getLogger(WeatherDataService.class);

    @Value("${weather.apiKey}")
    private String weatherApiKey;

    @Value("${weather.BASEURL}")
    private String WEATHER_API_BASEURL;

    @Autowired
    private RestTemplate restTemplate;

    public WeatherOutput getWeather(String city){

        final String WEATHER_API_URL = WEATHER_API_BASEURL +  weatherApiKey + "&q=" + city + "&aqi=no";

        Weather responseEntity =
                restTemplate.getForObject(WEATHER_API_URL, Weather.class);

        //log.info("Weather_API: " + weatherApiKey);
        return new WeatherOutput(responseEntity.getLocation(),responseEntity.getCurrent().getCondition());
    }

}
