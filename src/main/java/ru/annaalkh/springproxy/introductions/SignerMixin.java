package ru.annaalkh.springproxy.introductions;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by Anna on 10/25/2015.
 */
public class SignerMixin extends DelegatingIntroductionInterceptor implements SigningSupport {
    private String signature;

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String createSignature() {
        return signature;
    }
}
