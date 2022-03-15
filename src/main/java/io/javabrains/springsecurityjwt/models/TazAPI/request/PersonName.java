package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "givenName", "middleName", "familyName","affix", "noMiddleName" })
public class PersonName {

    @JsonProperty("GivenName")
    private String GivenName;           // 32 Char
    @JsonProperty("FamilyName")
    private String FamilyName;          // 64 Char
    @JsonProperty("MiddleName")
    private String MiddleName;          // 32 Char
    @JsonProperty("NoMiddleName")
    private String NoMiddleName;        // True | False
    @JsonProperty("Affix")
    private String Affix;               // JR | SR | I | II | III | IV

    @XmlElement(name = "GivenName")
    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    @XmlElement(name = "FamilyName")
    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    @XmlElement(name = "MiddleName")
    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    @XmlElement(name = "NoMiddleName")
    public void setNoMiddleName(String noMiddleName) {
        NoMiddleName = noMiddleName;
    }

    @XmlElement(name = "Affix")
    public void setAffix(String affix) {
        Affix = affix;
    }

    public String getGivenName() {
        return GivenName;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getNoMiddleName() {
        return NoMiddleName;
    }

    public String getAffix() {
        return Affix;
    }
}
