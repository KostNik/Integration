package com.edu.sandbox.weather.serviceactivators;

import lombok.extern.log4j.Log4j2;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.util.ErrorHandler;

@Log4j2
@MessageEndpoint("errorHandler")
public class WeatherPredictionErrorHandler implements ErrorHandler {

    @Override
    public void handleError(Throwable t) {
        log.error(t);
    }
}
