package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.models.TazAPI.Request.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;

@Service
public class TazAPIService {

    private Logger log = LoggerFactory.getLogger(TazAPIService.class);

    @Autowired
    private RestTemplate restTemplate;

    public BackgroundCheck getXMLRequest() throws JAXBException,Exception {

        BackgroundCheck backgroundCheck = new BackgroundCheck();
        backgroundCheck.setUserId("XML_User_Name");
        backgroundCheck.setPassword("XML_Password");

        BackgroundSearchPackage backgroundSearchPackage =  new BackgroundSearchPackage();
        backgroundSearchPackage.setReferenceId("123ABC");

        PersonalData personalData = new PersonalData();

        PersonName personName = new PersonName();
        personName.setGivenName("Dwight");
        personName.setMiddleName("Kurt");
        personName.setFamilyName("Schrute");
        personName.setAffix("III");

        personalData.setPersonName(personName);

        DemographicDetail demographicDetail = new DemographicDetail();
        GovernmentId governmentId = new GovernmentId();
        governmentId.setCountryCode("US");
        governmentId.setIssuingAuthority("SSN");
        demographicDetail.setGender('M');
        demographicDetail.setDateOfBirth("1974-01-20");

        personalData.setDemographicDetail(demographicDetail);

        PostalAddress postalAddress = new PostalAddress();
        postalAddress.setCountryCode("US");
        postalAddress.setPostalCode("18505");
        postalAddress.setRegion("PA");

        DeliveryAddress deliveryAddress =  new DeliveryAddress();
        deliveryAddress.setAddressLine("1725 Slough Avenue");
        postalAddress.setDeliveryAddress(deliveryAddress);

        personalData.setEmailAddress("test@noemail.com");
        personalData.setTelephone("717-555-0177");

        backgroundSearchPackage.setPersonalData(personalData);

        Screenings screenings = new Screenings();

        ArrayList<Screening> screeningList = new ArrayList<>();

        Screening screening = new Screening();

        screening.setType("ssn");

        Vendor vendor = new Vendor();
        vendor.setType("idsearchplus");
        vendor.setHigh_risk_fraud_alert("yes");

        screening.setVendor(vendor);

        AdditionalItems additionalItems = new AdditionalItems();
        additionalItems.setType("x:integration_type");

        screeningList.add(screening);
        screenings.setScreening(screeningList);
        screenings.setAdditionalItems(additionalItems);

        backgroundSearchPackage.setScreenings(screenings);
        backgroundCheck.setBackgroundSearchPackage(backgroundSearchPackage);

//        JAXBContext context = JAXBContext.newInstance(BackgroundCheck.class);
//        Marshaller mar= context.createMarshaller();
//        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//        StringWriter sw = new StringWriter();
//
//        mar.marshal(backgroundCheck, sw);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_XML);
//        HttpEntity<String> request = new HttpEntity<String>(xmlString, headers);
//
        BackgroundCheck response = restTemplate.postForObject("http://localhost:8095/postxml",backgroundCheck, BackgroundCheck.class);
        return response;
    }
}
