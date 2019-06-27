package com.edu.sandbox.weather.controllers;

import com.edu.sandbox.weather.WeatherPredictionQuery;
import com.edu.sandbox.weather.domain.Weather;
import com.edu.sandbox.weather.gateway.WeatherRequestGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather/v1/")
public class WeatherRest {


    private final WeatherRequestGateway weatherRequestGateway;

    public WeatherRest(WeatherRequestGateway weatherRequestGateway) {
        this.weatherRequestGateway = weatherRequestGateway;
    }


    @RequestMapping(path = "{country}/{city}", method = RequestMethod.GET)
    public ResponseEntity getForCountryAndCity(@PathVariable String country, @PathVariable String city) {
        WeatherPredictionQuery predictionQuery = WeatherPredictionQuery.builder().city(city).country(country).build();
        Weather weather = weatherRequestGateway.requestWeather(predictionQuery);
        return ResponseEntity.ok(weather);
    }


}
