package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class SupportingDocumentation {

    private String authorization;               // Yes | No
    private String spouse;                      // Yes | No
    private String OriginalFileName;            // 64 Char
    private String Name;                        // 255 Char
    private String EncodedContent;              // encode file

    @XmlAttribute
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    @XmlAttribute
    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    @XmlElement(name = "OriginalFileName")
    public void setOriginalFileName(String originalFileName) {
        OriginalFileName = originalFileName;
    }

    @XmlElement(name = "Name")
    public void setName(String name) {
        Name = name;
    }

    @XmlElement(name = "EncodedContent")
    public void setEncodedContent(String encodedContent) {
        EncodedContent = encodedContent;
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getSpouse() {
        return spouse;
    }

    public String getOriginalFileName() {
        return OriginalFileName;
    }

    public String getName() {
        return Name;
    }

    public String getEncodedContent() {
        return EncodedContent;
    }
}
