package ru.annaalkh.springproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by Anna on 10/26/2015.
 */
public class CatMain {

    public static void main(String[] args) {
        Cat cat = new CatImpl();
        InvocationHandler handler = new FlyingInvocationHandler(cat);
        Cat flyingCat = (Cat) Proxy.newProxyInstance(Cat.class.getClassLoader(),
                new Class[] { Cat.class },
                handler);
        flyingCat.mew();
        System.out.println(flyingCat.toString());
    }
}
