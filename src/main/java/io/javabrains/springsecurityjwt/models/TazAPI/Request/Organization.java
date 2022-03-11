package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "type", "organizationName","organizationCode", "organizationUser" })
public class Organization {

    private String type;                    // x:requesting | x:substitute
    private String OrganizationName;        // 64 Char
    private String OrganizationCode;        // 64 Char
    private String OrganizationUser;        // 64 Char : "Lname,Fname" -> Lname(32 Char), Fname(32 Char) : ",Fname" -> Lname absent

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "OrganizationName")
    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }

    @XmlElement(name = "OrganizationCode")
    public void setOrganizationCode(String organizationCode) {
        OrganizationCode = organizationCode;
    }

    @XmlElement(name = "OrganizationUser")
    public void setOrganizationUser(String organizationUser) {
        OrganizationUser = organizationUser;
    }


    public String getType() {
        return type;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public String getOrganizationUser() {
        return OrganizationUser;
    }
}
