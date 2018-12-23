package com.edu.service;

import com.edu.data.Account;
import com.edu.gateway.AccountGateway;
import com.edu.provider.AccountProvider;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Log4j2
@Service("timeGeneratedAccountService")
public class TimeGeneratedAccountService implements AccountService {


    @Autowired
    private AccountProvider randomAccountProviderImpl;
    @Autowired
    private AccountGateway accountGateway;

    @Override
    public void processAccount() {

        Disposable disposable = Observable.interval(5000, TimeUnit.MILLISECONDS)
                .map(i -> randomAccountProviderImpl.getCustomAccount())
                .subscribe(account -> {
                    log.info("!!! Account generated {}", account);
                    Account account_ = accountGateway.publishAccount(account);
//                    log.info("AFTER PUBLISHING : {}", account_);
                });

    }
}
