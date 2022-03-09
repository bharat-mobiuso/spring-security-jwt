package io.javabrains.springsecurityjwt.models.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Current {

    @JsonProperty("condition")
    private Condition Condition;

    public Condition getCondition() {
        return Condition;
    }

    public void setCondition(Condition condition) {
        Condition = condition;
    }
}
