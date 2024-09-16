package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.Deka;
import com.jurist101.webservice.services.DekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DekaController {

//    @Autowired
//    private DekaService service;
//
//    @GetMapping("dekas")
//    @ResponseBody
//    public List<Deka> getAll(){
//        return service.getAllDaka();
//    }
}
