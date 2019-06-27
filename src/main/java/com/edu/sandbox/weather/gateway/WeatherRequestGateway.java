package com.edu.sandbox.weather.gateway;

import com.edu.sandbox.weather.WeatherPredictionQuery;
import com.edu.sandbox.weather.domain.Weather;

public interface WeatherRequestGateway {

    Weather requestWeather(WeatherPredictionQuery query);

}
