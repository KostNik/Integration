package com.edu;

import com.edu.service.AccountService;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("com/edu/integration-config.xml");
        applicationContext.start();

        AccountService timeGeneratedAccountService = applicationContext.getBean("timeGeneratedAccountService", AccountService.class);

        timeGeneratedAccountService.processAccount();
    }
}
