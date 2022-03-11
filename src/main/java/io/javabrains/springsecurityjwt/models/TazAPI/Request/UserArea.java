package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlElement;

public class UserArea {

    private CreditCard creditCard;
    private CreditCardPayment creditCardPayment;

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
