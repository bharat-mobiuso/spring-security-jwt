package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;

public class CreditCardPayment {

    @JsonProperty("Amount")
    private int Amount;
    @JsonProperty("SalesTax")
    private int SalesTax;
    @JsonProperty("LastFour")
    private String LastFour;                // 4 Char
    @JsonProperty("TransactionId")
    private String TransactionId;           // 32 Char
    @JsonProperty("AuthorizationCode")
    private String AuthorizationCode;       // 8 Char

    @XmlElement(name = "Amount")
    public void setAmount(int amount) {
        Amount = amount;
    }

    @XmlElement(name = "SalesTax")
    public void setSalesTax(int salesTax) {
        SalesTax = salesTax;
    }

    @XmlElement(name = "LastFour")
    public void setLastFour(String lastFour) {
        LastFour = lastFour;
    }

    @XmlElement(name = "TransactionId")
    public void setTransactionId(String transactionId) {
        TransactionId = transactionId;
    }

    @XmlElement(name = "AuthorizationCode")
    public void setAuthorizationCode(String authorizationCode) {
        AuthorizationCode = authorizationCode;
    }
}
