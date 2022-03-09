package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.models.covid.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidDetailsService {
    private Logger log = LoggerFactory.getLogger(CovidDetailsService.class);

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

    public Country getCovidDetailsByCountry(String country){

        final String COVID_API_URL = COVID_API_BASEURL + "/" + country;
        try {
            Country countryData =
                    restTemplate.getForObject(COVID_API_URL, Country.class);

            return countryData;
        }catch (HttpClientErrorException e){
            //log.error(String.valueOf(e.getMessage()));

            Country countryInstance = new Country();
            countryInstance.setCountryName(e.getMessage().split(":")[2]);
            return countryInstance;
        }
    }
}
