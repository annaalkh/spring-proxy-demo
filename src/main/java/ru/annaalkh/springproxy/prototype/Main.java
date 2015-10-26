package ru.annaalkh.springproxy.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anna on 10/23/2015.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("prototype-application-context.xml");
        SingletonBean singletonBean = (SingletonBean) springContext.getBean("singletonBean");
        singletonBean.firstCall();
        singletonBean.secondCall();
    }
}
