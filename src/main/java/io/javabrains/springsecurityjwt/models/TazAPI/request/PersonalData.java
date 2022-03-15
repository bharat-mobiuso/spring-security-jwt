package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "personName", "alias", "demographicDetail", "postalAddress","emailAddress","telephone", "sendText", "race"  })
public class PersonalData {

    @JsonProperty("Telephone")
    private String Telephone;           // 24 Char
    @JsonProperty("SendText")
    private String SendText;            // Yes | No
    @JsonProperty("EmailAddress")
    private String EmailAddress;        // 256 Char
    @JsonProperty("Race")
    private String Race;                // 32 Char

    @JsonProperty("PersonName")
    private PersonName personName;
    @JsonProperty("PostalAddress")
    private PostalAddress postalAddress;
    @JsonProperty("DemographicDetail")
    private DemographicDetail demographicDetail;
    @JsonProperty("Alias")
    private Alias alias;

    @XmlElement(name = "Telephone")
    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    @XmlElement(name = "SendText")
    public void setSendText(String sendText) {
        SendText = sendText;
    }

    @XmlElement(name = "EmailAddress")
    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    @XmlElement(name = "Race")
    public void setRace(String race) {
        Race = race;
    }

    @XmlElement(name = "PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    @XmlElement(name = "PostalAddress")
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    @XmlElement(name = "DemographicDetail")
    public void setDemographicDetail(DemographicDetail demographicDetail) {
        this.demographicDetail = demographicDetail;
    }

    @XmlElement(name = "Alias")
    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getSendText() {
        return SendText;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getRace() {
        return Race;
    }

    public PersonName getPersonName() {
        return personName;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public DemographicDetail getDemographicDetail() {
        return demographicDetail;
    }

    public Alias getAlias() {
        return alias;
    }
}
