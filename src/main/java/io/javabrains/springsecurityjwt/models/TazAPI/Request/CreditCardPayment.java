package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

public class CreditCardPayment {

    private int Amount;
    private int SalesTax;
    private String LastFour;                // 4 Char
    private String TransactionId;           // 32 Char
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
