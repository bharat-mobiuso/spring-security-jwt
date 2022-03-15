package io.javabrains.springsecurityjwt.models.TazAPI.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PositionDetails {

    @JsonProperty("Billable")
    private String Billable;                    // 64 Char
    @JsonProperty("CostCode")
    private String CostCode;                    // 64 Char
    @JsonProperty("DesiredUnit")
    private String DesiredUnit;                    // 64 Char
    @JsonProperty("EmploymentState")
    private String EmploymentState;                    // 64 Char
    @JsonProperty("JobCode")
    private String JobCode;
    @JsonProperty("JobLocation")
    private String JobLocation;
    @JsonProperty("OptionalField1")
    private String OptionalField1;
    @JsonProperty("OptionalField2")
    private String OptionalField2;
    @JsonProperty("OptionalField3")
    private String OptionalField3;
    @JsonProperty("OptionalField4")
    private String OptionalField4;
    @JsonProperty("OptionalField5")
    private String OptionalField5;
    @JsonProperty("OptionalField6")
    private String OptionalField6;
    @JsonProperty("OptionalField7")
    private String OptionalField7;
    @JsonProperty("OptionalField8")
    private String OptionalField8;
    @JsonProperty("OptionalField9")
    private String OptionalField9;
    @JsonProperty("OptionalField10")
    private String OptionalField10;
    @JsonProperty("ReferredBy")
    private String ReferredBy;
    @JsonProperty("ProposedPosition")
    private String ProposedPosition;
    @JsonProperty("ProposedSalary")
    private String ProposedSalary;

}
