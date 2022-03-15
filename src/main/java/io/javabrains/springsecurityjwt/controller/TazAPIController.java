package io.javabrains.springsecurityjwt.controller;

import io.javabrains.springsecurityjwt.models.TazAPI.request.BackgroundCheck;
import io.javabrains.springsecurityjwt.models.TazAPI.response.BackgroundReports;
import io.javabrains.springsecurityjwt.services.TazAPIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class TazAPIController {

    private Logger log = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    TazAPIService tazAPIService;

    @PostMapping(value = "/tazapi2",consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE })
    public BackgroundReports getdata1(@RequestBody BackgroundCheck backgroundCheck) throws Exception {
        //log.info("POST : " + backgroundCheck.getBackgroundSearchPackage().getScreenings().getScreening().get(0).getVendor().getValue());

        return tazAPIService.postXmlUsingJson1(backgroundCheck);
    }

    @PostMapping(value = "/tazapi1",consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE })
    public BackgroundCheck getdata2(@RequestBody BackgroundCheck backgroundCheck) throws Exception {
        //log.info("POST : " + backgroundCheck.getBackgroundSearchPackage().getScreenings().getScreening().get(0).getVendor().getValue());

        return tazAPIService.postXmlUsingJson2(backgroundCheck);
    }

//    @PostMapping(value = "/postxml", consumes = MediaType.APPLICATION_XML_VALUE)
//    public void postxml(@RequestBody BackgroundCheck backgroundCheck){
//        log.info(backgroundCheck.getPassword());
//    }

}
