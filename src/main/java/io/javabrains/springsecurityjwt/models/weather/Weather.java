package io.javabrains.springsecurityjwt.models.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties   // Used to tell spring that parse JSON response only and ignore others
public class Weather {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("current")
    private Current current;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
       this.location = location;
    }

    public Current getCurrent() {
       return current;
    }

    public void setCurrent(Current current) {
       this.current = current;
}
}
