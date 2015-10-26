package ru.annaalkh.springproxy.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Anna on 10/23/2015.
 */
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {

    @Autowired
    private PrototypeBeanInterface prototypeBean;

    public void firstCall() {
        prototypeBean.makeCall();
    }

    public void secondCall() {
        prototypeBean.makeCall();
    }
}
