package com.edu.sandbox.weather;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication(scanBasePackages = {"com.edu.sandbox.weather"})
public class TestWeather {

    public static void main(String[] args) {
        SpringApplication.run(TestWeather.class, args);


//        GenericApplicationContext applicationContext =
//                new GenericXmlApplicationContext("com/edu/sandbox/weather/weather-config-spring.xml");
//        applicationContext.start();
//
//        WeatherRequestGateway weatherRequestGateway = applicationContext.getBean(WeatherRequestGateway.class);
//        WeatherPredictionQuery predictionQuery = WeatherPredictionQuery.builder().city("Kharkiv").country("ua").build();

//        log.info("QUERY to send: {}", predictionQuery);
//        WeatherPrediction weather = weatherRequestGateway.requestWeather(predictionQuery);

//        System.out.println(weather);

    }


    private static void weatherTask() {

    }

}
