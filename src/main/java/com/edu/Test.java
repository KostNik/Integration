package com.edu;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("com/edu/integration-config.xml");
        applicationContext.start();


    }
}
