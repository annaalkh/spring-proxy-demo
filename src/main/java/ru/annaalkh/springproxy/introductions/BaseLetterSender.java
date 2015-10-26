package ru.annaalkh.springproxy.introductions;

/**
 * Created by Anna on 10/25/2015.
 */
public class BaseLetterSender implements LetterSender {

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("Message with text \n" + text + "\n sended.");
    }
}
