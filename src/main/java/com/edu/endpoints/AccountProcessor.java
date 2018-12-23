package com.edu.endpoints;

import com.edu.data.Account;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountProcessor {

    public void consumeAccount(Account account) {
        log.info("CONSUMED!!!                               {} was consumed", account);
    }


    public Account supplyAccount(Account account_1) {
        consumeAccount(account_1);
//        Account account = Account.builder().accountType(AccountType.PUBLIC).age(999).name("GENERATED").build();
//        log.info("Supplied!!! account {} was generated", account);
        return account_1;
    }


}
