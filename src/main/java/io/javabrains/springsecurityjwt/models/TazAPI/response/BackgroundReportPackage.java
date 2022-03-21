package io.javabrains.springsecurityjwt.models.TazAPI.response;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "referenceId", "orderId","reportURL", "screeningStatus","screenings","errorReport", "applicantInterfaceURL" })
public class BackgroundReportPackage {

    private String ReferenceId;
    private String OrderId;
    private String ReportURL;

    private ScreeningStatus screeningStatus;
    private Screenings screenings;
    private ErrorReport errorReport;

    private String ApplicantInterfaceURL;

    @XmlElement(name = "ReferenceId")
    public void setReferenceId(String referenceId) {
        ReferenceId = referenceId;
    }

    @XmlElement(name = "OrderId")
    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    @XmlElement(name = "ReportURL")
    public void setReportURL(String reportURL) {
        ReportURL = reportURL;
    }

    @XmlElement(name = "ScreeningStatus")
    public void setScreeningStatus(ScreeningStatus screeningStatus) {
        this.screeningStatus = screeningStatus;
    }

    @XmlElement(name = "Screenings")
    public void setScreenings(Screenings screenings) {
        this.screenings = screenings;
    }

    @XmlElement(name = "ErrorReport")
    public void setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
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

    public String getReportURL() {
        return ReportURL;
    }

    public Screenings getScreenings() {
        return screenings;
    }

    public ErrorReport getErrorReport() {
        return errorReport;
    }

}
