package ru.annaalkh.springproxy.aspect;

import org.springframework.stereotype.Component;

/**
 * Created by Anna on 10/25/2015.
 */
@Component
public class DataProviderService {

    public void getData() {
        System.out.println("Prepare important data");
    }
}
