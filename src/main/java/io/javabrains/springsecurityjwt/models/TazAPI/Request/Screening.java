package io.javabrains.springsecurityjwt.models.TazAPI.Request;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "type","qualifier", "name", "vendor" })
public class Screening {

    private String type;                    // assumedname | bankruptcy | civil | credit | criminal | custom |drug | education | employment | eviction | executivesummary | license | lienjudgment | healthcare_compliance | personsearch | reference | resident | scorecard | sex_offender | ssn | workcomp
    private String qualifier;               // See Below commented Text
    private String name;                    // for custom

    private Vendor vendor;                  //

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "Vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getType() {
        return type;
    }

    public String getQualifier() {
        return qualifier;
    }

    public String getName() {
        return name;
    }

    public Vendor getVendor() {
        return vendor;
    }
}

/*
possible values for qualifier
`````````````````````````````
@type="civil"
possible values include:
county | federal

@type="criminal"
possible values include:
county | statewide | federal | international | singlestate | national | national_alias | security

@type="custom"
possible values include:
credentials | drug | identity | investigative | repository | summarization | verification

@type="eviction"
possible values include:
singlestate | national

@type="license"
possible values include:
professional | imvcommercial | imvPersonal

@type="reference"
possible values include:
personal | professional
 */