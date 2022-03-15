package io.javabrains.springsecurityjwt.models.TazAPI.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "BackgroundReports")
@XmlType(propOrder = { "backgroundReportPackage" })
public class BackgroundReports {

    private BackgroundReportPackage backgroundReportPackage;

    @XmlElement(name = "BackgroundReportPackage")
    public void setBackgroundReportPackage(BackgroundReportPackage backgroundReportPackage) {
        this.backgroundReportPackage = backgroundReportPackage;
    }

    public BackgroundReportPackage getBackgroundReportPackage() {
        return backgroundReportPackage;
    }
}
