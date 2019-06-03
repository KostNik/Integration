package com.edu.sandbox.weather;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class WeatherPredictionQuery {

    private String countryLabel;
    private String cityLabel;




}
