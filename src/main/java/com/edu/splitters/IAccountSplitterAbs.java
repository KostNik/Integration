package com.edu.splitters;

import com.edu.data.Account;
import com.edu.data.EncryptedAccount;
import com.edu.data.IAccount;
import com.google.common.collect.Lists;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.util.Base64Utils;

import java.util.List;

public class IAccountSplitterAbs extends AbstractMessageSplitter {

    @Override
    protected List<IAccount> splitMessage(Message<?> message) {
        Account payload = (Account) message.getPayload();

        String name = payload.getName();
        String s = Base64Utils.encodeToString(name.getBytes());

        EncryptedAccount encryptedAccount = EncryptedAccount.builder().encryptedName(s).build();
        return Lists.newArrayList(payload, encryptedAccount);
    }
}
