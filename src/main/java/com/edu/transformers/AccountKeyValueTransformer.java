package com.edu.transformers;

import com.edu.data.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.transformer.Transformer;
import org.springframework.messaging.Message;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AccountKeyValueTransformer implements Transformer {

    public Map<String, Object> transform(Account account) {
        log.info("transform account to map");
        Map<String, Object> tradeNameValuesMap = new HashMap<>();
        tradeNameValuesMap.put("ACCOUNT_NAME", account.getName());
        tradeNameValuesMap.put("ACCOUNT_TYPE", account.getAccountType());
        return tradeNameValuesMap;
    }


    @Override
    public Message<Map<String, Object>> transform(Message<?> message) {
        log.info("transform message to map");
        return MessageBuilder.withPayload(transform((Account) message.getPayload())).copyHeaders(message.getHeaders()).build();
    }

}
