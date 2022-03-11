package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "personName" })
public class Alias {

    private PersonName personName;

    @XmlElement(name = "PersonName")
    public void setPersonName(PersonName personName) {
        this.personName = personName;
    }

    public PersonName getPersonName() {
        return personName;
    }
}
