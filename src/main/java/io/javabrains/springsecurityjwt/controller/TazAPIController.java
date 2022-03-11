package io.javabrains.springsecurityjwt.controller;

import io.javabrains.springsecurityjwt.models.TazAPI.Request.BackgroundCheck;
import io.javabrains.springsecurityjwt.services.TazAPIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class TazAPIController {

    private Logger log = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    TazAPIService tazAPIService;

    @GetMapping(value = "/tazapi", produces = { MediaType.APPLICATION_XML_VALUE})
    public BackgroundCheck getWeather() throws Exception {
        //log.info("CITY : " + city + "OUTPUT: " + weatherDataService.getWeather(city).toString().toString());
        return tazAPIService.getXMLRequest();
    }

    @PostMapping(value = "/postxml", consumes = MediaType.APPLICATION_XML_VALUE)
    public void postxml(@RequestBody BackgroundCheck backgroundCheck){
        log.info(backgroundCheck.getPassword());
    }

}
