package com.edu.sandbox;

import com.edu.data.Account;
import com.edu.data.AccountType;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class SXActivator {

    @Autowired
    @Qualifier("to-splitter-channel")
    private MessageChannel toSplitterChannel;

    @EventListener(classes = {ContextRefreshedEvent.class})
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Account some_account = Account.builder().accountType(AccountType.PUBLIC).age(12).name("Some_name").build();
        log.info("Send account {}", some_account);

        Message<Account> objectMessageBuilder = MessageBuilder.withPayload(some_account).build();
        toSplitterChannel.send(objectMessageBuilder);

    }
}
