package ru.annaalkh.springproxy.introductions;

import java.util.List;

/**
 * Created by Anna on 10/25/2015.
 */
public class LetterManager {

    List<LetterSender> letterSenders;

    public void sendLetters() {
        String text = "Hello all";
        for (LetterSender sender: letterSenders) {
            String currentText = text;
            if (sender instanceof SigningSupport) {
                currentText += ((SigningSupport) sender).createSignature();
            }
            sender.setText(currentText);
            sender.send();
        }
    }

    public void setLetterSenders(List<LetterSender> letterSenders) {
        this.letterSenders = letterSenders;
    }
}
