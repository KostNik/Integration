package com.edu.sandbox.weather;

import com.edu.sandbox.weather.domain.Weather;
import com.edu.sandbox.weather.gateway.WeatherRequestGateway;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Log4j2
public class TestWeather {

    public static void main(String[] args) {
        GenericApplicationContext applicationContext =
                new GenericXmlApplicationContext("com/edu/sandbox/weather/weather-config-spring.xml");
        applicationContext.start();

        WeatherRequestGateway weatherRequestGateway = applicationContext.getBean(WeatherRequestGateway.class);
        WeatherPredictionQuery predictionQuery = WeatherPredictionQuery.builder().city("Kharkiv").country("ua").build();

        log.info("QUERY to send: {}", predictionQuery);
        Weather weather = weatherRequestGateway.requestWeather(predictionQuery);

        System.out.println(weather);
    }


    private static void weatherTask() {

    }

}
