package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.services.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LawController {

    @Autowired
    private LawService service;

    @GetMapping("mylaws")
    @ResponseBody
    public Page<Law> getAllLaws(){
        return service.getAllLaw();
    }

}
