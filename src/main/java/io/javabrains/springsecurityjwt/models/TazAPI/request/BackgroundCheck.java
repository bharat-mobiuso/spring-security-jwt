package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name = "BackgroundCheck")
@XmlType(propOrder = { "userId", "password", "backgroundSearchPackage", "userArea" })      // Don't Understand whats going in here
public class BackgroundCheck {

    @JsonProperty("userId")
    private String userId;      // 50 Char
    @JsonProperty("password")
    private String password;    // 50 Char

    @JsonProperty("BackgroundSearchPackage")
    private BackgroundSearchPackage backgroundSearchPackage;
    @JsonProperty("UserArea")
    private UserArea userArea;

    @XmlAttribute
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @XmlAttribute
    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "BackgroundSearchPackage")
    public void setBackgroundSearchPackage(BackgroundSearchPackage backgroundSearchPackage) {
        this.backgroundSearchPackage = backgroundSearchPackage;
    }


    @XmlElement(name = "UserArea")
    public void setUserArea(UserArea userArea) {
        this.userArea = userArea;
    }

    public BackgroundCheck() {
    }

    public BackgroundCheck(String userId, String password, BackgroundSearchPackage backgroundSearchPackage, UserArea userArea) {
        this.userId = userId;
        this.password = password;
        this.backgroundSearchPackage = backgroundSearchPackage;
        this.userArea = userArea;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public BackgroundSearchPackage getBackgroundSearchPackage() {
        return backgroundSearchPackage;
    }

    public UserArea getUserArea() {
        return userArea;
    }

}
