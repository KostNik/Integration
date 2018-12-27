package com.edu.filters;

import com.edu.data.Account;
import com.edu.data.AccountType;
import org.springframework.integration.annotation.Filter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class AccountFilterAnn {

    @Filter
    public boolean accept(Message<?> message) {
        Account payload = (Account) message.getPayload();
        return payload.getAccountType().equals(AccountType.PUBLIC);
    }
}
