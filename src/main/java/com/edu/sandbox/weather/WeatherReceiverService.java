package com.edu.sandbox.weather;

import com.edu.sandbox.weather.domain.WeatherPrediction;

public interface WeatherReceiverService {

    WeatherPrediction getCurrentWeatherInfo(WeatherPredictionQuery query);

}
