package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "cardType", "cardNumber", "cardSecurity", "expireMonth", "expireYear", "firstName", "lastName", "billingStreetAddress", "billingCity", "billingState", "billingZip" })
public class CreditCard {

    @JsonProperty("CardType")
    private String CardType;                // visa|amex|discover|mastercard
    @JsonProperty("CardNumber")
    private int CardNumber;                 // 16 Digit
    @JsonProperty("CardSecurity")
    private int CardSecurity;               // 3-5 Digit
    @JsonProperty("ExpireMonth")
    private short ExpireMonth;              // 2 Digit
    @JsonProperty("ExpireYear")
    private short ExpireYear;               // 4 Digit
    @JsonProperty("FirstName")
    private String FirstName;               // 64 Char
    @JsonProperty("LastName")
    private String LastName;                // 64 Char
    @JsonProperty("BillingStreetAddress")
    private String BillingStreetAddress;    // 128 Char
    @JsonProperty("BillingCity")
    private String BillingCity;             // 128 Char
    @JsonProperty("BillingState")
    private String BillingState;            // 16 Char
    @JsonProperty("BillingZip")
    private int BillingZip;                 // 5 or 5-4 Digit

    @XmlElement(name = "CardType")
    public void setCardType(String cardType) {
        CardType = cardType;
    }

    @XmlElement(name = "CardNumber")
    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    @XmlElement(name = "CardSecurity")
    public void setCardSecurity(int cardSecurity) {
        CardSecurity = cardSecurity;
    }

    @XmlElement(name = "ExpireMonth")
    public void setExpireMonth(short expireMonth) {
        ExpireMonth = expireMonth;
    }

    @XmlElement(name = "ExpireYear")
    public void setExpireYear(short expireYear) {
        ExpireYear = expireYear;
    }

    @XmlElement(name = "FirstName")
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @XmlElement(name = "LastName")
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @XmlElement(name = "BillingStreetAddress")
    public void setBillingStreetAddress(String billingStreetAddress) {
        BillingStreetAddress = billingStreetAddress;
    }

    @XmlElement(name = "BillingCity")
    public void setBillingCity(String billingCity) {
        BillingCity = billingCity;
    }

    @XmlElement(name = "BillingState")
    public void setBillingState(String billingState) {
        BillingState = billingState;
    }

    @XmlElement(name = "BillingZip")
    public void setBillingZip(int billingZip) {
        BillingZip = billingZip;
    }

    public String getCardType() {
        return CardType;
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public int getCardSecurity() {
        return CardSecurity;
    }

    public short getExpireMonth() {
        return ExpireMonth;
    }

    public short getExpireYear() {
        return ExpireYear;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getBillingStreetAddress() {
        return BillingStreetAddress;
    }

    public String getBillingCity() {
        return BillingCity;
    }

    public String getBillingState() {
        return BillingState;
    }

    public int getBillingZip() {
        return BillingZip;
    }
}
