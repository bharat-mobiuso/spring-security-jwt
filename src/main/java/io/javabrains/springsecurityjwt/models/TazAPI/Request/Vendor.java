package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "type","high_risk_fraud_alert" })
public class Vendor {

    private String type;                        //
    private String high_risk_fraud_alert;       // yes | no

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setHigh_risk_fraud_alert(String high_risk_fraud_alert) {
        this.high_risk_fraud_alert = high_risk_fraud_alert;
    }

    public String getType() {
        return type;
    }

    public String getHigh_risk_fraud_alert() {
        return high_risk_fraud_alert;
    }
}
