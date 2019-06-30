package com.edu.sandbox.weather.gateway;

import com.edu.sandbox.weather.WeatherPredictionQuery;
import com.edu.sandbox.weather.domain.WeatherPrediction;

public interface WeatherRequestGateway {

    WeatherPrediction requestWeather(WeatherPredictionQuery query);

}
