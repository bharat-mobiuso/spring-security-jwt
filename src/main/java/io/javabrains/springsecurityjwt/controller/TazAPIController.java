package io.javabrains.springsecurityjwt.controller;

import io.javabrains.springsecurityjwt.models.TazAPI.request.BackgroundCheck;
import io.javabrains.springsecurityjwt.services.TazAPIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
public class TazAPIController {

    private Logger log = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    TazAPIService tazAPIService;

    @PostMapping(value = "/createOrder",consumes = { MediaType.APPLICATION_JSON_VALUE } )
    public String createOrder(@RequestBody BackgroundCheck backgroundCheck) throws Exception {
        //log.info("POST : " + backgroundCheck.getBackgroundSearchPackage().getReferenceId());

        return tazAPIService.createOrder(backgroundCheck);
    }

    @GetMapping(value = "/checkOrderStatus" )
    public String checkStatus(@RequestParam String orderId) throws Exception {
        //log.info("POST : " + backgroundCheck.getBackgroundSearchPackage().getScreenings().getScreening().get(0).getVendor().getValue());

        return tazAPIService.checkOrderStatus(orderId);
    }


}
