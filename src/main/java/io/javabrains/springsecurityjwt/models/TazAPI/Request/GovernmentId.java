package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "issuingAuthority","countryCode", "jurisdiction" })
public class GovernmentId {

    private String issuingAuthority;        // SSN | DMV
    private String countryCode;             // 2 Char
    private String jurisdiction;            // 2 Char

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

    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }
}
