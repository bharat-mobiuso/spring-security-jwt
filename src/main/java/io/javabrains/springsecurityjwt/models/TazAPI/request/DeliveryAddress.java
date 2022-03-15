package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "addressLine" })
public class DeliveryAddress {

    @JsonProperty("AddressLine")
    private String AddressLine;             // 63 Char

    @XmlElement(name = "AddressLine")
    public void setAddressLine(String addressLine) {
        AddressLine = addressLine;
    }

    public String getAddressLine() {
        return AddressLine;
    }
}
