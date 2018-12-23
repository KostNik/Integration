package com.edu.provider;

import com.edu.data.Account;
import com.edu.data.AccountType;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountBuilder {

    public Account buildRandomAccount() {
        int age = RandomUtils.nextInt(0, 100);
        String name = RandomStringUtils.randomAlphabetic(RandomUtils.nextInt(1, 15));
        int nextInt = RandomUtils.nextInt(0, 2);
        AccountType accountType = AccountType.values()[nextInt];
        return Account.builder().accountType(accountType).age(age).name(name).build();
    }


}
