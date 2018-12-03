package com.edu.channels;

import com.edu.data.Account;
import org.springframework.messaging.Message;

import java.util.Comparator;

public class AccountAgeComparator implements Comparator<Message<Account>> {

    @Override
    public int compare(Message<Account> msg1, Message<Account> msg2) {
        Account a1 = msg1.getPayload();
        Account a2 = msg2.getPayload();
        Integer i1 = a1.getAge();
        Integer i2 = a2.getAge();
        return i1.compareTo(i2);
    }

}
