package com.edu.provider;

import com.edu.data.Account;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class RandomAccountProviderImpl implements AccountProvider {

    @Autowired
    private AccountBuilder accountBuilder;

    @Override
    public Account getCustomAccount() {
        return accountBuilder.buildRandomAccount();
    }

}
