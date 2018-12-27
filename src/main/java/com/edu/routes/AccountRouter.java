package com.edu.routes;

import com.edu.data.Account;
import org.springframework.messaging.Message;

public class AccountRouter {

    public String oldAccount(Message<Account> message) {
        Account payload = message.getPayload();
        if (payload.getAge() > 30) {
            return "old-channel";
        }
        return "young-channel";
    }

}
