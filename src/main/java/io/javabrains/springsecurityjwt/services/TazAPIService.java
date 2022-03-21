package io.javabrains.springsecurityjwt.services;

import io.javabrains.springsecurityjwt.models.TazAPI.request.*;
import io.javabrains.springsecurityjwt.models.TazAPI.response.BackgroundReports;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

@Service
public class TazAPIService {

    private Logger log = LoggerFactory.getLogger(TazAPIService.class);

    @Value("${TazAPI.BASEURL}")
    private String TazAPIBaseUrl;

    @Value("${TazAPI.packageName}")
    private String TazAPIPackageName;

    @Value("${TazAPI.username}")
    private String TazAPIUsername;

    @Value("${TazAPI.password}")
    private String TazAPIPassword;

    @Autowired
    private RestTemplate restTemplate;

    public String createOrder(BackgroundCheck backgroundCheck) throws JAXBException,Exception {

        try {
            // Hardcoded request Body
            /*
            String xmlContent = "<?xml version='1.0'?>\n" +
                    "   <BackgroundCheck userId='alphayouth_xml' password='@1PhA_Y0uTh_sp0Rt$'>\n" +
                    "      <BackgroundSearchPackage action='submit' type='Alpha Youth Sports - Package 1'>\n" +
                    "         <ReferenceId>123ABC</ReferenceId>\n" +
                    "         <PersonalData>\n" +
                    "            <PersonName>\n" +
                    "               <GivenName>Dwight</GivenName>\n" +
                    "               <MiddleName>Kurt</MiddleName>\n" +
                    "               <FamilyName>Schrute</FamilyName>\n" +
                    "               <Affix>III</Affix>\n" +
                    "            </PersonName>\n" +
                    "            <DemographicDetail>\n" +
                    "                <GovernmentId countryCode='US' issuingAuthority='SSN'>111-22-3333</GovernmentId>\n" +
                    "                <Gender>M</Gender>\n" +
                    "                <DateOfBirth>1974-01-20</DateOfBirth>\n" +
                    "            </DemographicDetail>\n" +
                    "            <PostalAddress>\n" +
                    "                <CountryCode>US</CountryCode>\n" +
                    "                <PostalCode>18505</PostalCode>\n" +
                    "                <Region>PA</Region>\n" +
                    "                <Municipality>Scranton</Municipality>\n" +
                    "                <DeliveryAddress>\n" +
                    "                    <AddressLine>1725 Slough Avenue</AddressLine>\n" +
                    "                </DeliveryAddress>\n" +
                    "            </PostalAddress>\n" +
                    "            <EmailAddress>test@noemail.com</EmailAddress>\n" +
                    "            <Telephone>717-555-0177</Telephone>\n" +
                    "         </PersonalData>\n" +
                    "         <Screenings>\n" +
                    "            <Screening type='ssn'>\n" +
                    "               <Vendor type='idsearchplus' high_risk_fraud_alert='yes'>transunion</Vendor>\n" +
                    "            </Screening>\n" +
                    "            <AdditionalItems type='x:integration_type'>\n" +
                    "               <Text>Integrating Platform Company Name</Text>\n" +
                    "            </AdditionalItems>\n" +
                    "         </Screenings>\n" +
                    "      </BackgroundSearchPackage>\n" +
                    "   </BackgroundCheck>";
             */

            // Fitting username, password, and pkg name fetched from properties
            backgroundCheck.setUserId(TazAPIUsername);
            backgroundCheck.setPassword(TazAPIPassword);
            backgroundCheck.getBackgroundSearchPackage().setType(TazAPIPackageName);
            backgroundCheck.getBackgroundSearchPackage().getScreenings().setUseConfigurationDefaults("yes");

            // Convert Object to XML -- Marshalling
            String request = marshalBackgroundCheck(backgroundCheck);

            log.info("BEFORE RESPONSE : ");

            ResponseEntity<String> response = restTemplate.postForEntity(
                    TazAPIBaseUrl,
                    request,
                    String.class);

            log.info("RESPONSE CODE : " + response.getStatusCode());
//            log.info("RESPONSE : " + response);

            // Convert XML to Object -- UnMarshalling
            BackgroundReports backgroundReports = unmarshalBackgroundReports(response.getBody());

            String outputStr = "";
            if(response.getStatusCode().equals(HttpStatus.OK)){
                outputStr = "Your Order Has been created successfully,\n Your Order Id is : "
                        + backgroundReports.getBackgroundReportPackage().getOrderId();
            }
            return outputStr;

        } catch (Exception e) {
            log.error( "Exception : " + e.getMessage());

            return "Exception Occurred : " + e.getMessage();
        }

    }

    public String checkOrderStatus(String orderId) throws JAXBException,Exception {

        try{
            BackgroundCheck backgroundCheck = new BackgroundCheck();
            backgroundCheck.setUserId(TazAPIUsername);
            backgroundCheck.setPassword(TazAPIPassword);

            BackgroundSearchPackage backgroundSearchPackage = new BackgroundSearchPackage();
            backgroundSearchPackage.setAction("status");
            backgroundSearchPackage.setOrderId(orderId);
            backgroundCheck.setBackgroundSearchPackage(backgroundSearchPackage);

            // Convert Object to XML -- Marshalling
            String request = marshalBackgroundCheck(backgroundCheck);

            log.info("BEFORE RESPONSE : ");
            ResponseEntity<String> response = restTemplate.postForEntity(
                    TazAPIBaseUrl,
                    request,
                    String.class);

            log.info("RESPONSE CODE : " + response.getStatusCode());
            //log.info("RESPONSE : " + response);

            // Convert XML to Object -- UnMarshalling
            BackgroundReports backgroundReports = unmarshalBackgroundReports(response.getBody());

            String outputStr = "";
            if(response.getStatusCode().equals(HttpStatus.OK)){
                outputStr = "Your Order Status Fetched successfully," +
                        "\nYour Order Id is : " +
                        backgroundReports.getBackgroundReportPackage().getOrderId() +
                        " and Status is : " +
                        backgroundReports.getBackgroundReportPackage().getScreeningStatus().getOrderStatus().getText();
            }
            return outputStr;

        } catch (Exception e) {
            log.error( "Exception : " + e.getMessage());
            e.printStackTrace();
            return "Exception Occurred : " + e.getMessage();
        }
    }

    private String marshalBackgroundCheck(BackgroundCheck backgroundCheck) throws JAXBException {

        try {       //----------- Convert Object to XML -- Marshalling
            //Create JAXB Context of BackgroundCheck
            JAXBContext jaxbContext = JAXBContext.newInstance(BackgroundCheck.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter xmlContent = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(backgroundCheck, xmlContent);

            //Verify XML Content
           // log.info(xmlContent.toString());
            //----------- END OF Converting Object to XML

            String xmlContentStr = xmlContent.toString();

            return xmlContentStr;

        } catch (Exception e) {
            throw new JAXBException(e.getMessage());
        }
    }

    private BackgroundReports unmarshalBackgroundReports(String xmlContent) throws JAXBException {
        try {
            //---------- Convert XML to Object -- UnMarshalling
            //Create JAXB Context of BackgroundReports
            JAXBContext jaxbContext = JAXBContext.newInstance(BackgroundReports.class);
            //Create UnMarshaller
            Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
            //Convert String to Object
            BackgroundReports backgroundReports = (BackgroundReports) jaxbUnMarshaller.unmarshal(new StringReader(xmlContent));
            //---------- END OF Converting XML to Object

            return backgroundReports;
        }catch (Exception e){
            throw new JAXBException(e.getMessage());
        }
    }
}


