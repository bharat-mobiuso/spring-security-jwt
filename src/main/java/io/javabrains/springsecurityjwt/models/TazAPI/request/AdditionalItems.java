package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "type", "text" })
public class AdditionalItems {

    @JsonProperty("type")
    private String type;
    @JsonProperty("Text")
    private String Text;

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "Text")
    public void setText(String text) {
        Text = text;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return Text;
    }
}
