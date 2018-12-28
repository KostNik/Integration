package com.edu;

import com.edu.someTests.EmailTest;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.mail.MessagingException;

public class Test {


    public static void main(String[] args) throws MessagingException {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("com/edu/integration-config.xml");
        applicationContext.start();

//        AccountService timeGeneratedAccountService = applicationContext.getBean("timeGeneratedAccountService", AccountService.class);
        EmailTest emailTest = applicationContext.getBean("emailTest", EmailTest.class);
        emailTest.test();
    }
}
