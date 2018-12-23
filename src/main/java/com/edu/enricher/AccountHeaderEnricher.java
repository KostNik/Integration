package com.edu.enricher;

import com.edu.data.Account;
import org.springframework.messaging.Message;

public class AccountHeaderEnricher {

    public String enrichHeader(Message message) {
        Account account = (Account) message.getPayload();
        return account.getName() + "_SRC";
    }


    public Account enrichPayload(Message message) {
        Account payload = (Account) message.getPayload();
        payload.setAge(payload.getAge() + 20);
        return payload;
    }

}