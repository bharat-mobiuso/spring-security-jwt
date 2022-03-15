package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.models.TazAPI.request.*;
import io.javabrains.springsecurityjwt.models.TazAPI.response.BackgroundReports;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBException;

@Service
public class TazAPIService {

    private Logger log = LoggerFactory.getLogger(TazAPIService.class);

    @Autowired
    private RestTemplate restTemplate;

    public BackgroundReports postXmlUsingJson1(BackgroundCheck backgroundCheck) throws JAXBException,Exception {

        BackgroundReports response = restTemplate.postForObject(
                "http://localhost:8095/postxml1",
                backgroundCheck,
                BackgroundReports.class);

    //    log.info("Response : " + response);

//        BackgroundReports backgroundReports = response.getBody();

        return response;
    }

    public BackgroundCheck postXmlUsingJson2(BackgroundCheck backgroundCheck) throws JAXBException,Exception {

        BackgroundCheck response = restTemplate.postForObject(
                "http://localhost:8095/postxml2",
                backgroundCheck,
                BackgroundCheck.class);

        return response;
    }
}
