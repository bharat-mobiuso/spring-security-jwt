package io.javabrains.springsecurityjwt.controller;

import io.javabrains.springsecurityjwt.models.auth.AuthenticationRequest;
import io.javabrains.springsecurityjwt.models.auth.AuthenticationResponse;
import io.javabrains.springsecurityjwt.models.covid.Country;
import io.javabrains.springsecurityjwt.models.weather.WeatherOutput;
import io.javabrains.springsecurityjwt.services.CovidDetailsService;
import io.javabrains.springsecurityjwt.services.MyUserDetailsService;
import io.javabrains.springsecurityjwt.services.WeatherDataService;
import io.javabrains.springsecurityjwt.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResourceController {

    private Logger log = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private CovidDetailsService covidDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @GetMapping("/hello")
    public String hello() {
        return ("<h1>Hello World</h1>");
    }

    @GetMapping("/weather")
    public WeatherOutput getWeather(@RequestParam(defaultValue = "london") String city){
        //log.info("CITY : " + city + "OUTPUT: " + weatherDataService.getWeather(city).toString().toString());
        return weatherDataService.getWeather(city);
    }

    @GetMapping("/covid")
    public Country[] getCovidDetails(){
        return covidDetailsService.getCovidDetails();
    }

    @GetMapping("/covid/country")
    public Country getCovidDetails(@RequestParam(defaultValue = "IND") String name){
        return covidDetailsService.getCovidDetailsByCountry(name);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailsService.
                loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }


}


// apis
/*
    /authenticate       -> POST api Require Json body { "username" : /username, "password" : /password } -> get jwt
    /hello              -> GET require Auth as Bearer Token
    /weather            -> GET require Param city  ->/weather?city=/cityname  -> Return WeatherDetails and Location Details
    /covid              -> GET -> Return List of Countries with covid data
    /covid/country      -> GET require Param name  ->/covid/country?name=/countryName -> Return Covid Data for countryName
 */