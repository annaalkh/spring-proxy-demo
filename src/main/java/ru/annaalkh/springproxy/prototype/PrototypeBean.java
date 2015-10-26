package ru.annaalkh.springproxy.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Anna on 10/23/2015.
 */
@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
public class PrototypeBean implements PrototypeBeanInterface {

    private int id = new Random().nextInt();

    @Override
    public void makeCall() {
        System.out.println("Bean with id " + id + " is called");
    }

}
