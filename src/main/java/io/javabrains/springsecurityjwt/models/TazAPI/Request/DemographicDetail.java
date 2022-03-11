package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "governmentId","gender", "dateOfBirth" })
public class DemographicDetail {

    private String DateOfBirth;         // format : YYYY-MM-DD
    private char Gender;                // M | F
    private GovernmentId governmentId;  // SSN or Driving Licence Number

    @XmlElement(name = "DateOfBirth")
    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }


    @XmlElement(name = "Gender")
    public void setGender(char gender) {
        Gender = gender;
    }

    @XmlElement(name = "GovernmentId")
    public void setGovernmentId(GovernmentId governmentId) {
        this.governmentId = governmentId;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public char getGender() {
        return Gender;
    }

    public GovernmentId getGovernmentId() {
        return governmentId;
    }
}
