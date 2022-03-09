package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.models.covid.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidDetailsService {

    @Value("${covid.BASEURL}")
    private String COVID_API_BASEURL;

    @Autowired
    private RestTemplate restTemplate;

    public Country[] getCovidDetails(){

        final String COVID_API_URL = COVID_API_BASEURL;

        ResponseEntity<Country[]> responseEntity =
                restTemplate.getForEntity(COVID_API_URL, Country[].class);

        Country[] countries = responseEntity.getBody();

        return countries;
    }
}
