package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class UserArea {

    @JsonProperty("CreditCard")
    private CreditCard creditCard;
    @JsonProperty("CreditCardPayment")
    private CreditCardPayment creditCardPayment;

    @JsonProperty("PositionDetails")
    private PositionDetails positionDetails;

    @XmlElement(name = "CreditCard")
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @XmlElement(name = "CreditCardPayment")
    public void setCreditCardPayment(CreditCardPayment creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
    }

    @XmlElement(name = "PositionDetails")
    public void setPositionDetails(PositionDetails positionDetails) {
        this.positionDetails = positionDetails;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public CreditCardPayment getCreditCardPayment() {
        return creditCardPayment;
    }

    public PositionDetails getPositionDetails() {
        return positionDetails;
    }
}
