package com.edu.transformers;

import com.edu.data.Account;
import lombok.extern.log4j.Log4j2;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class AccountStringTransformer {

    @Transformer
    public String transform(Account account) {
        log.info("transform account to string");
        return account.toString();
    }


}
