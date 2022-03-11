package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "type", "text" })
public class AdditionalItems {

    private String Type;
    private String Text;

    @XmlAttribute
    public void setType(String type) {
        Type = type;
    }

    @XmlElement(name = "Text")
    public void setText(String text) {
        Text = text;
    }

    public String getType() {
        return Type;
    }

    public String getText() {
        return Text;
    }
}
