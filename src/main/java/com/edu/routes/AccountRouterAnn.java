package com.edu.routes;

import com.edu.data.Account;
import org.springframework.integration.annotation.Router;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class AccountRouterAnn {

    @Router
    public String oldAccount(Message<Account> message) {
        Account payload = message.getPayload();
        if (payload.getAge() > 30) {
            return "old-channel";
        }
        return "young-channel";
    }

}
