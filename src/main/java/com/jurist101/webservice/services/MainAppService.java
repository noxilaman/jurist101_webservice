package com.jurist101.webservice.services;

import com.jurist101.webservice.models.MainApp;
import com.jurist101.webservice.repositories.MainAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainAppService {

    public MainAppRepository getMainAppRepo() {
        return mainAppRepo;
    }

    @Autowired
    public void setMainAppRepo(MainAppRepository mainAppRepo) {
        this.mainAppRepo = mainAppRepo;
    }

    private MainAppRepository mainAppRepo;

    public List<MainApp> getListMainApp(){
        return mainAppRepo.findAll();
    }

    public List<MainApp> getListMainAppByType(String typeName){

        return mainAppRepo.findAll();
    }


}
