package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "internetWebAddress", "type", "mediaType", "resultType"})
public class ScreeningResults {
    private String InternetWebAddress;       // postback URL
    private String type;                     // result
    private String mediaType;                // html
    private String resultType;               // report

    @XmlElement(name = "InternetWebAddress")
    public void setInternetWebAddress(String internetWebAddress) {
        InternetWebAddress = internetWebAddress;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    @XmlAttribute
    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public String getInternetWebAddress() {
        return InternetWebAddress;
    }

    public String getType() {
        return type;
    }

    public String getMediaType() {
        return mediaType;
    }

    public String getResultType() {
        return resultType;
    }
}
