package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = { "type", "countryCode","postalCode", "region", "municipality", "deliveryAddress" })
public class PostalAddress {

    @JsonProperty("type")
    private String type;                // current | previous
    @JsonProperty("CountryCode")
    private String CountryCode;         // 2 Char   ISO 3166-1 alpha-2 code
    @JsonProperty("PostalCode")
    private String PostalCode;          // 32 Char
    @JsonProperty("Region")
    private String Region;              // 2 Char   USPS-2-letter State Code
    @JsonProperty("Municipality")
    private String Municipality;        // 32 Char

    @JsonProperty("DeliveryAddress")
    private DeliveryAddress deliveryAddress;

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "CountryCode")
    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    @XmlElement(name = "PostalCode")
    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    @XmlElement(name = "Region")
    public void setRegion(String region) {
        Region = region;
    }

    @XmlElement(name = "Municipality")
    public void setMunicipality(String municipality) {
        Municipality = municipality;
    }

    @XmlElement(name = "DeliveryAddress")
    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getType() {
        return type;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public String getRegion() {
        return Region;
    }

    public String getMunicipality() {
        return Municipality;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }
}
