package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.services.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LawController {

    @Autowired
    private LawService service;

    @GetMapping("laws")
    @ResponseBody
    public List<Law> getAllLaws(){
        return service.getAllLaw();
    }

}
