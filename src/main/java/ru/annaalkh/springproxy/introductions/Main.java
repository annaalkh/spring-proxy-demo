package ru.annaalkh.springproxy.introductions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.annaalkh.springproxy.prototype.SingletonBean;

/**
 * Created by Anna on 10/24/2015.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("introductions-application-context.xml");

        LetterManager letterManager = (LetterManager) springContext.getBean("letterManager");
        letterManager.sendLetters();
    }

}
