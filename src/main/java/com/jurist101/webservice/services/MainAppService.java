package com.jurist101.webservice.services;

import com.jurist101.webservice.models.MainApp;
import com.jurist101.webservice.repositories.MainAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainAppService {

//    public MainAppRepository getMainAppRepo() {
//        return mainAppRepo;
//    }
//
//    @Autowired
//    public void setMainAppRepo(MainAppRepository mainAppRepo) {
//        this.mainAppRepo = mainAppRepo;
//    }
//
    @Autowired
    private MainAppRepository mainAppRepo;
//
    public Page<MainApp> getListMainApp(Pageable page){
        return mainAppRepo.findAll(page);
    }

    public Page<MainApp> getListMainAppByType(String group_name, Pageable pageable){
        return mainAppRepo.findByGroupApp(group_name, pageable);
    }

    public Optional<MainApp> getMainAppById(int id) {
        return mainAppRepo.findById(id);
    }

    public Page<MainApp> getListMainAppByName(String name, Pageable pageable){
        return mainAppRepo.findByNameContaining(name, pageable);
    }



}
