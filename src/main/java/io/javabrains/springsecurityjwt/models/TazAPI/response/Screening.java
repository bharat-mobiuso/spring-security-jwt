package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "screeningResults"})
public class Screening {
    private ScreeningResults ScreeningResults;

    public ScreeningResults getScreeningResults() {
        return ScreeningResults;
    }

    @XmlElement(name = "ScreeningResults")
    public void setScreeningResults(ScreeningResults screeningResults) {
        ScreeningResults = screeningResults;
    }
}
