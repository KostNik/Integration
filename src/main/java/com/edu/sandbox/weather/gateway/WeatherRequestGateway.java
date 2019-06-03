package com.edu.sandbox.weather.gateway;

import com.edu.sandbox.weather.WeatherPredictionQuery;

public interface WeatherRequestGateway {

    Object requestWeather(WeatherPredictionQuery query);

}
