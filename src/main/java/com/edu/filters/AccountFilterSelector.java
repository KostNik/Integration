package com.edu.filters;

import com.edu.data.Account;
import com.edu.data.AccountType;
import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class AccountFilterSelector implements MessageSelector {

    @Override
    public boolean accept(Message<?> message) {
        Account payload = (Account) message.getPayload();
        return payload.getAccountType().equals(AccountType.PUBLIC);
    }
}
