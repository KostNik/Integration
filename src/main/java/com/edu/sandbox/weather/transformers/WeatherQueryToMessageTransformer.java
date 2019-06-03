package com.edu.sandbox.weather.transformers;

import com.edu.sandbox.weather.WeatherPredictionQuery;
import lombok.extern.log4j.Log4j2;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.handler.AbstractMessageHandler;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.edu.sandbox.weather.Constants.CITY_KEY;
import static com.edu.sandbox.weather.Constants.COUNTRY_KEY;

@Log4j2
public class WeatherQueryToMessageTransformer extends AbstractMessageHandler implements MessageProducer {

    private MessageChannel outputChannel;

    public Message transformToMessage(Message<WeatherPredictionQuery> query) {
        log.info("TRANSFORM Message (query) {} :", query);
        return MessageBuilder.withPayload(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
                .setHeader(CITY_KEY, query.getPayload().getCityLabel())
                .setHeader(COUNTRY_KEY, query.getPayload().getCountryLabel())
                .build();
    }

    @Override
    protected void handleMessageInternal(Message<?> message) throws Exception {
        log.info("TRANSFORMED Message {}", message);
        getOutputChannel().send(message);
    }

    @Override
    public MessageChannel getOutputChannel() {
        return outputChannel;
    }

    @Override
    public void setOutputChannel(MessageChannel outputChannel) {
        this.outputChannel = outputChannel;
    }
}
