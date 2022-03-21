package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "errorCode", "errorDescription"})
public class ErrorReport {

    private String ErrorCode;
    private String ErrorDescription;

    @XmlElement(name = "errorCode")
    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    @XmlElement(name = "errorDescription")
    public void setErrorDescription(String errorDescription) {
        ErrorDescription = errorDescription;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public String getErrorDescription() {
        return ErrorDescription;
    }
}
