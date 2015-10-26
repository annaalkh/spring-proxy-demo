package ru.annaalkh.springproxy.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Anna on 10/25/2015.
 */
@Component
public class DataConsumerService {

    @Autowired
    private DataProviderService dataProviderService;

    public void doImportantWork() {
        System.out.println("Start doing work");
        dataProviderService.getData();
    }
}
