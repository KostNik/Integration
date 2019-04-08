package com.edu.endpoints;

import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

@Log4j2
public class ServiceActivatorSX implements MessageHandler {

    @Override
    public void handleMessage(Message<?> message) throws MessagingException {
        log.info(message);
    }
}
