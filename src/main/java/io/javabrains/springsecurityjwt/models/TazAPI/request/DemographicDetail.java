package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "governmentId","gender", "dateOfBirth" })
public class DemographicDetail {

    @JsonProperty("DateOfBirth")
    private String DateOfBirth;         // format : YYYY-MM-DD
    @JsonProperty("Gender")
    private String Gender;              // M | F
    @JsonProperty("GovernmentId")
    private GovernmentId governmentId;  // SSN or Driving Licence Number

    @XmlElement(name = "DateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @XmlElement(name = "Gender")
    public void setGender(String gender) {
        Gender = gender;
    }

    @XmlElement(name = "GovernmentId")
    public void setGovernmentId(GovernmentId governmentId) {
        this.governmentId = governmentId;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public GovernmentId getGovernmentId() {
        return governmentId;
    }
}
