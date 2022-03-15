package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


@XmlType(propOrder = { "issuingAuthority","countryCode", "jurisdiction","value" })
public class GovernmentId {

    @JsonProperty("issuingAuthority")
    private String issuingAuthority;        // SSN | DMV
    @JsonProperty("countryCode")
    private String countryCode;             // 2 Char
    @JsonProperty("jurisdiction")
    private String jurisdiction;            // 2 Char
    @JsonProperty("value")
    private String value;

    @XmlAttribute
    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    @XmlAttribute
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @XmlAttribute
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public String getValue() {
        return value;
    }
}
