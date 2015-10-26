package ru.annaalkh.springproxy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Anna on 10/25/2015.
 */
public class SmartLogger {

    public Object doLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Method execution started for method " + pjp.getSignature().getName());
        try {
           return pjp.proceed();
        } catch (Throwable e) {
            System.out.println("Exception thrown during execution " + pjp.getSignature().getName());
            throw e;
        }
        finally {
            System.out.println("Method execution ended for method " + pjp.getSignature().getName());
        }
    }
}
