package ru.annaalkh.springproxy.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anna on 10/25/2015.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("aspect-application-context.xml");
        DataConsumerService dataConsumer= (DataConsumerService) springContext.getBean("dataConsumerService");
        dataConsumer.doImportantWork();
    }
}
