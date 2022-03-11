package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = { "useConfigurationDefaults", "screening","additionalItems" })
public class Screenings {

    private String useConfigurationDefaults;        // Yes | No

    private List<Screening> screening;
    private AdditionalItems additionalItems;

    @XmlAttribute
    public void setUseConfigurationDefaults(String useConfigurationDefaults) {
        this.useConfigurationDefaults = useConfigurationDefaults;
    }

    @XmlElement(name = "Screening")
    public void setScreening(List<Screening> screening) {
        this.screening = screening;
    }

    @XmlElement(name = "AdditionalItems")
    public void setAdditionalItems(AdditionalItems additionalItems) {
        this.additionalItems = additionalItems;
    }

    public String getUseConfigurationDefaults() {
        return useConfigurationDefaults;
    }

    public List<Screening> getScreening() {
        return screening;
    }

    public AdditionalItems getAdditionalItems() {
        return additionalItems;
    }
}
