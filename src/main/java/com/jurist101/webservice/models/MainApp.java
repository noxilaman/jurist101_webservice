package com.jurist101.webservice.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainApp {

    @Autowired
    LawData law;

    public void showName(){
        law.showName();
        System.out.println("Show NAme");
    }
}
