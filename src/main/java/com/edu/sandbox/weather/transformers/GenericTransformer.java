package com.edu.sandbox.weather.transformers;

import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;

public interface GenericTransformer<T, N> extends Transformer {

    @Override
    default Message<?> transform(Message<?> message) {
        return transformInternally((Message<T>) message);
    }

    Message<N> transformInternally(Message<T> message);
}
