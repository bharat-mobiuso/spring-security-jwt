package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "addressLine" })
public class DeliveryAddress {

    private String AddressLine;             // 63 Char

    @XmlElement(name = "AddressLine")
    public void setAddressLine(String addressLine) {
        AddressLine = addressLine;
    }

    public String getAddressLine() {
        return AddressLine;
    }
}
