package com.edu.filters;

import com.edu.data.Account;
import com.edu.data.AccountType;
import org.springframework.messaging.Message;

public class AccountFilter {

    public boolean isSecuredAccount(Message<Account> message) {
        Account payload = message.getPayload();
        return payload.getAccountType().equals(AccountType.SECURED);
    }
}
