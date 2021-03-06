
package com.edu.sandbox.weather.domain;

import com.edu.sandbox.weather.domain.deserializer.DateConverter;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "message",
    "country",
    "sunrise",
    "sunset"
})
public class Sys {

    @JsonProperty("type")
    private int type;
    @JsonProperty("id")
    private int id;
    @JsonProperty("message")
    private double message;
    @JsonProperty("country")
    private String country;
    @JsonProperty("sunrise")
    @JsonDeserialize(converter = DateConverter.class)
    private LocalDateTime sunrise;
    @JsonProperty("sunset")
    @JsonDeserialize(converter = DateConverter.class)
    private LocalDateTime sunset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public int getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(int type) {
        this.type = type;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("message")
    public double getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(double message) {
        this.message = message;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("sunrise")
    public LocalDateTime getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(LocalDateTime sunrise) {
        this.sunrise = sunrise;
    }

    @JsonProperty("sunset")
    public LocalDateTime getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(LocalDateTime sunset) {
        this.sunset = sunset;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("id", id).append("message", message).append("country", country).append("sunrise", sunrise).append("sunset", sunset).append("additionalProperties", additionalProperties).toString();
    }

}
