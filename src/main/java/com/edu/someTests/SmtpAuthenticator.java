package com.edu.someTests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

@Component
public class SmtpAuthenticator extends Authenticator {

    @Value("${spring.mail.username}")
    private String name;
    @Value("${spring.mail.password}")
    private String password;

    @Override
    public PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(name, password);

    }
}
