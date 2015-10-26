package ru.annaalkh.springproxy.jdk;

/**
 * Created by Anna on 10/26/2015.
 */
public class CatImpl implements Cat {

    @Override
    public void mew() {
        System.out.println("MEW!!!");
    }

    @Override
    public String toString() {
        return "Very clever cat";
    }
}
