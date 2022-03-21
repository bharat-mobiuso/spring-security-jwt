package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "screening"})
public class Screenings {
    private Screening Screening;

    public Screening getScreening() {
        return Screening;
    }

    @XmlElement(name = "Screening")
    public void setScreening(Screening screening) {
        Screening = screening;
    }
}
