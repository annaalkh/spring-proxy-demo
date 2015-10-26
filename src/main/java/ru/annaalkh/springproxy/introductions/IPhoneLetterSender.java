package ru.annaalkh.springproxy.introductions;

/**
 * Created by Anna on 10/25/2015.
 */
public class IPhoneLetterSender extends BaseLetterSender implements SigningSupport {

    @Override
    public String createSignature() {
        return "\nSend from my IPhone";
    }
}
