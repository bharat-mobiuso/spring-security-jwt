package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlType(propOrder = { "flag", "text"})
public class OrderStatus {
    private String flag;
    private String text;

    @XmlAttribute
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @XmlValue
    public void setText(String text) {
        this.text = text;
    }

    public String getFlag() {
        return flag;
    }

    public String getText() {
        return text;
    }
}
