package com.edu.sandbox.weather.serviceactivators;

import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.Message;

@Log4j2
public class InfoServiceActivator {

    public void printData(Message message) {
        log.info("HEADERS: {}", message.getHeaders());
        log.info("PAYLOAD: {}", message.getPayload());
    }

}
