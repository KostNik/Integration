
package com.edu.sandbox.weather.domain;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temp",
    "pressure",
    "humidity",
    "temp_min",
    "temp_max"
})
public class Main {

    @JsonProperty("temp")
    private double temp;
    @JsonProperty("pressure")
    private int pressure;
    @JsonProperty("humidity")
    private int humidity;
    @JsonProperty("temp_min")
    private double tempMin;
    @JsonProperty("temp_max")
    private double tempMax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("temp")
    public double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(double temp) {
        this.temp = temp;
    }

    @JsonProperty("pressure")
    public int getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("humidity")
    public int getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("temp_min")
    public double getTempMin() {
        return tempMin;
    }

    @JsonProperty("temp_min")
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    @JsonProperty("temp_max")
    public double getTempMax() {
        return tempMax;
    }

    @JsonProperty("temp_max")
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
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
        return new ToStringBuilder(this).append("temp", temp).append("pressure", pressure).append("humidity", humidity).append("tempMin", tempMin).append("tempMax", tempMax).append("additionalProperties", additionalProperties).toString();
    }

}