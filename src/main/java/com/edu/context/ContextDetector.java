package com.edu.context;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ContextDetector implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("{}", applicationContext);
        MessageChannel messageChannel;
    }
}
