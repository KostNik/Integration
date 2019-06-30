package com.edu.sandbox.weather.correlation;

import org.springframework.integration.aggregator.CorrelationStrategy;
import org.springframework.messaging.Message;

public class CityCorrelationStrategy implements CorrelationStrategy {

    @Override
    public Object getCorrelationKey(Message<?> message) {
        return message.getHeaders().get("CITY_KEY");
    }

}
