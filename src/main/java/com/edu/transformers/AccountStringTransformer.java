package com.edu.transformers;

import com.edu.data.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AccountStringTransformer {

    @Transformer
    public String transform(Account account) {
        log.info("transform account to string");
        return account.toString();
    }


}
