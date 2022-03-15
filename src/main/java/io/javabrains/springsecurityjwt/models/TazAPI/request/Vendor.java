package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlType(propOrder = { "type","high_risk_fraud_alert" })
public class Vendor {

    @JsonProperty("type")
    private String type;                        //
    @JsonProperty("high_risk_fraud_alert")
    private String high_risk_fraud_alert;       // yes | no

    @JsonProperty("value")
    private String value;

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setHigh_risk_fraud_alert(String high_risk_fraud_alert) {
        this.high_risk_fraud_alert = high_risk_fraud_alert;
    }

    @XmlValue
    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getHigh_risk_fraud_alert() {
        return high_risk_fraud_alert;
    }

    public String getValue() {
        return value;
    }
}
