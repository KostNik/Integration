package com.edu.endpoints;

import com.edu.data.Account;
import com.edu.data.AccountType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AccountProcessor {

    public void consumeAccount(Account account) {
        log.info("account {} was consumed", account);
    }


    public Account supplyAccount(Account account_1) {
        consumeAccount(account_1);
        Account account = new Account();
        account.setName("GENERATED");
        account.setAge(999);
        account.setAccountType(AccountType.PUBLIC);
        log.info("account {} was generated", account);
        return account;
    }


}
