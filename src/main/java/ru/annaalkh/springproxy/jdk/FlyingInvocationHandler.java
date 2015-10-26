package ru.annaalkh.springproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Anna on 10/26/2015.
 */
public class FlyingInvocationHandler implements InvocationHandler {

    private Object target;

    public FlyingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I can fly!");
        return method.invoke(target, args);
    }
}
