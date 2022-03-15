package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(propOrder = { "useConfigurationDefaults", "screening","additionalItems" })
public class Screenings {

    @JsonProperty("useConfigurationDefaults")
    private String useConfigurationDefaults;        // Yes | No

    @JsonProperty("Screening")
    private List<Screening> screening;
    @JsonProperty("AdditionalItems")
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
