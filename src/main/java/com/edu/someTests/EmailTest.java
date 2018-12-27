package com.edu.someTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Component;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.time.Instant;

@Component
public class EmailTest {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    @Qualifier("receiveChannel")
    private DirectChannel inputChannel;

    public void test() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        mimeMessage.addHeader("some header", "some valueq");
        mimeMessage.setText("TEXT " + Instant.now());
        mimeMessage.addRecipients(Message.RecipientType.TO, "mk_dev@aol.com");

//        javaMailSender.send(mimeMessage);

        inputChannel.subscribe(message -> {
            Object payload = message.getPayload();
            MessageHeaders headers = message.getHeaders();
            System.out.println(payload);
            System.out.println(headers);
        });

    }

}
