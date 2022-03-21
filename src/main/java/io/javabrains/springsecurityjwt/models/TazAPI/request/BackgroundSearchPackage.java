package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "action", "type","orderId", "referenceId", "reference", "personalData","screenings","supportingDocumentation","organization" })
public class BackgroundSearchPackage {
    @JsonProperty("action")
    private String action;      // submit | status | searchstatus | addcharge | add | url
    @JsonProperty("type")
    private String type;        //
    @JsonProperty("OrderId")
    private String OrderId;     //

    @JsonProperty("ReferenceId")
    private String ReferenceId; // 64 Char
    @JsonProperty("Reference")
    private String Reference;   // 64 Char

//    private LinkedApplicants linkApplicants;    // for tenant background checks
    @JsonProperty("Organization")
    private Organization organization;
    @JsonProperty("PersonalData")
    private PersonalData personalData;
    @JsonProperty("Screenings")
    private Screenings screenings;
    @JsonProperty("SupportingDocumentation")
    private SupportingDocumentation supportingDocumentation;
//    private UserArea userArea;

    @XmlAttribute
    public void setAction(String action) {
        this.action = action;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "ReferenceId")
    public void setReferenceId(String referenceId) {
        ReferenceId = referenceId;
    }

    @XmlElement(name = "Reference")
    public void setReference(String reference) {
        Reference = reference;
    }

    @XmlElement(name = "OrderId")
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    //    @XmlElement(name = "LinkedApplicants")
//    public void setLinkApplicants(LinkedApplicants linkApplicants) {
//        this.linkApplicants = linkApplicants;
//    }

    @XmlElement(name = "Organization")
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @XmlElement(name = "PersonalData")
    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    @XmlElement(name = "Screenings")
    public void setScreenings(Screenings screenings) {
        this.screenings = screenings;
    }

    @XmlElement(name = "SupportingDocumentation")
    public void setSupportingDocumentation(SupportingDocumentation supportingDocumentation) {
        this.supportingDocumentation = supportingDocumentation;
    }

//    @XmlElement(name = "UserArea")
//    public void setUserArea(UserArea userArea) {
//        this.userArea = userArea;
//    }

    public BackgroundSearchPackage() {
    }


    public String getAction() {
        return action;
    }

    public String getType() {
        return type;
    }

    public String getReferenceId() {
        return ReferenceId;
    }

    public String getReference() {
        return Reference;
    }

    public String getOrderId() {
        return OrderId;
    }

    //    public LinkedApplicants getLinkApplicants() {
//        return linkApplicants;
//    }

    public Organization getOrganization() {
        return organization;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public Screenings getScreenings() {
        return screenings;
    }

    public SupportingDocumentation getSupportingDocumentation() {
        return supportingDocumentation;
    }

//    public UserArea getUserArea() {
//        return userArea;
//    }
}
