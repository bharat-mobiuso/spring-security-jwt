package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "referenceId", "orderId", "screeningStatus", "applicantInterfaceURL" })
public class BackgroundReportPackage {


    private String ReferenceId;
    private String OrderId;

    private ScreeningStatus screeningStatus;

    private String ApplicantInterfaceURL;

    @XmlElement(name = "ReferenceId")
    public void setReferenceId(String referenceId) {
        ReferenceId = referenceId;
    }

    @XmlElement(name = "OrderId")
    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    @XmlElement(name = "ScreeningStatus")
    public void setScreeningStatus(ScreeningStatus screeningStatus) {
        this.screeningStatus = screeningStatus;
    }

    @XmlElement(name = "ApplicantInterfaceURL")
    public void setApplicantInterfaceURL(String applicantInterfaceURL) {
        ApplicantInterfaceURL = applicantInterfaceURL;
    }

    public String getReferenceId() {
        return ReferenceId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public ScreeningStatus getScreeningStatus() {
        return screeningStatus;
    }

    public String getApplicantInterfaceURL() {
        return ApplicantInterfaceURL;
    }
}
