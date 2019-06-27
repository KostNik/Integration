package com.edu.sandbox.weather.transformers;

import com.edu.sandbox.weather.WeatherPredictionQuery;
import lombok.extern.log4j.Log4j2;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.edu.sandbox.weather.Constants.CITY_KEY;
import static com.edu.sandbox.weather.Constants.COUNTRY_KEY;

@Log4j2
public class WeatherQueryToMessageTransformer implements GenericTransformer<WeatherPredictionQuery, String> {

    @Override
    public Message<String> transformInternally(Message<WeatherPredictionQuery> message) {
        log.info("TRANSFORM Message (query) {} :", message);
        return MessageBuilder.withPayload(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .setHeader(CITY_KEY, message.getPayload().getCity())
                .setHeader(COUNTRY_KEY, message.getPayload().getCountry())
                .build();
    }
}


