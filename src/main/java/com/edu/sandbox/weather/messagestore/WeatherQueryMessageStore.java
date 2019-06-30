package com.edu.sandbox.weather.messagestore;

import lombok.extern.log4j.Log4j2;
import org.springframework.integration.store.MessageMetadata;
import org.springframework.integration.store.SimpleMessageStore;
import org.springframework.messaging.Message;

import java.util.UUID;


@Log4j2
public class WeatherQueryMessageStore extends SimpleMessageStore {

    @Override
    public long getMessageCount() {
        log.info("getMessageCount");
        return super.getMessageCount();
    }

    @Override
    public <T> Message<T> addMessage(Message<T> message) {
        log.info("addMessage");
        return super.addMessage(message);
    }

    @Override
    public Message<?> getMessage(UUID key) {
        log.info("getMessage {}", key.toString());
        return super.getMessage(key);
    }

    @Override
    public MessageMetadata getMessageMetadata(UUID id) {
        log.info("getMessageMetadata {}", id.toString());
        return super.getMessageMetadata(id);
    }

    @Override
    public Message<?> removeMessage(UUID key) {
        log.info("removeMessage {}", key.toString());
        return super.removeMessage(key);
    }

    @Override
    public void addMessagesToGroup(Object groupId, Message<?>... messages) {
        log.info("addMessagesToGroup {}", groupId.toString());
        super.addMessagesToGroup(groupId, messages);
    }

    @Override
    public Message<?> pollMessageFromGroup(Object groupId) {
        log.info("pollMessageFromGroup {}", groupId);
        return super.pollMessageFromGroup(groupId);
    }
}
