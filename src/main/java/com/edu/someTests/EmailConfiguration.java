package com.edu.someTests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.mail.support.DefaultMailHeaderMapper;
import org.springframework.integration.mapping.HeaderMapper;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.AndTerm;
import javax.mail.search.FlagTerm;
import javax.mail.search.FromTerm;
import javax.mail.search.SearchTerm;
import java.util.Properties;

@Configuration
public class EmailConfiguration {

    @Bean
    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("spprttmail@gmail.com");
        mailSender.setPassword("123456Q!");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }

//    @Bean
//    public IntegrationFlow imapIdleFlow() {



//        return IntegrationFlows
//                .from(Mail.imapIdleAdapter("imap://user:pw@localhost:" + imapIdleServer.getPort() + "/INBOX")
//                        .autoStartup(true)
//                        .searchTermStrategy(this::fromAndNotSeenTerm)
//                        .userFlag("testSIUserFlag")
//                        .javaMailProperties(p -> p.put("mail.debug", "false")
//                                .put("mail.imap.connectionpoolsize", "5"))
//                        .shouldReconnectAutomatically(false)
//                        .headerMapper(mailHeaderMapper()))
//                .channel(MessageChannels.queue("imapIdleChannel"))
//                .get();
//    }

    @Bean
    public HeaderMapper<MimeMessage> mailHeaderMapper() {
        return new DefaultMailHeaderMapper();
    }

    private SearchTerm fromAndNotSeenTerm(Flags supportedFlags, Folder folder) {
        try {
            FromTerm fromTerm = new FromTerm(new InternetAddress("bar@baz"));
            return new AndTerm(fromTerm, new FlagTerm(new Flags(Flags.Flag.SEEN), false));
        }
        catch (AddressException e) {
            throw new RuntimeException(e);
        }

    }

}
