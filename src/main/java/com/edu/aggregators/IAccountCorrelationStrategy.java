package com.edu.aggregators;

import org.springframework.integration.aggregator.CorrelationStrategy;
import org.springframework.messaging.Message;

public class IAccountCorrelationStrategy implements CorrelationStrategy {


    @Override
    public Object getCorrelationKey(Message<?> message) {
        return null;
    }
}
