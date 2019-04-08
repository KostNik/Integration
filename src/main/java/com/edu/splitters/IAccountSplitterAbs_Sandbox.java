package com.edu.splitters;

import com.edu.data.Account;
import com.edu.data.EncryptedAccount;
import com.edu.data.IAccount;
import com.google.common.collect.Lists;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.util.Base64Utils;

import java.util.List;

public class IAccountSplitterAbs_Sandbox extends AbstractMessageSplitter {


    public static final String split_key = "SPLITTER_SX_HEADER";

    @Override
    protected List<IAccount> splitMessage(Message<?> message) {
        Object split_key = message.getHeaders().get(IAccountSplitterAbs_Sandbox.split_key);

        if (split_key == null) {
            Object errorChannel = message.getHeaders().getErrorChannel();
            throw new RuntimeException(message.toString());
        }


        Account payload = (Account) message.getPayload();

        String name = payload.getName();
        String s = Base64Utils.encodeToString(name.getBytes());

        EncryptedAccount encryptedAccount = EncryptedAccount.builder().encryptedName(s).build();
        return Lists.newArrayList(payload, encryptedAccount);
    }
}
