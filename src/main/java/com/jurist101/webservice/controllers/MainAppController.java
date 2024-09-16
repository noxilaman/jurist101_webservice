package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.MainApp;
import com.jurist101.webservice.services.MainAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainAppController {

    @Autowired
    private MainAppService service;
//
    @GetMapping("mainapp")
//    @ResponseBody
    public Page<MainApp> getAllMainApp(Pageable pageable){
        return service.getListMainApp(pageable);
    }

    @GetMapping("mainappByGroup/{groupApp}/Search")
    public List<MainApp> getMainAppByGroupApp(@PathVariable(value="groupApp") String group_app){
        System.out.println("getMainAppByGroupApp");
        // return service.getListMainAppByType(groupApp);
        return null;
    }

    @GetMapping("mainapp/{appId}")
//    @ResponseBody
    public Optional<MainApp> getMainAppById(@PathVariable(value="appId") String id){
        return service.getMainAppById(Integer.parseInt(id));
    }



}
