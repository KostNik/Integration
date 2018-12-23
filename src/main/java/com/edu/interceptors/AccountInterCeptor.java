package com.edu.interceptors;

import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;

@Log4j2
public class AccountInterCeptor implements ChannelInterceptor {

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
//        log.info("PRE_SEND Message {} PRE_SEND, channel {}", message, channel);
        return message;
    }

    @Override
    public void postSend(Message<?> message, MessageChannel channel, boolean sent) {
//        log.info("POST_SEND Message {} POST_SEND, channel {}, sent -> {}", message, channel, sent);
    }

    @Override
    public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {
//        log.info("AFTER_SEND_COMPLETION Message {} AFTER_SEND_COMPLETION, channel {}, sent -> {}, exc -> {}", message, channel, sent, ex);
    }

    @Override
    public boolean preReceive(MessageChannel channel) {
//        log.info("PRE_RECEIVE MessageChannel {} PRE_RECEIVE", channel);
        return true;
    }

    @Override
    public Message<?> postReceive(Message<?> message, MessageChannel channel) {
//        log.info("POST_RECEIVE Message {} POST_RECEIVE, channel {}", message, channel);
        return message;
    }

    @Override
    public void afterReceiveCompletion(Message<?> message, MessageChannel channel, Exception ex) {
//        log.info("AFTER_RECEIVE_COMPLETION Message {} AFTER_RECEIVE_COMPLETION, channel {}, exc -> {}", message, channel, ex);
    }
}
