package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.LawCat;
import com.jurist101.webservice.services.LawCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LawCatController {

    @Autowired
    private LawCatService service;

    @GetMapping("lawcat/{appId}")
    public Page<LawCat> getLawCatByAppId(@PathVariable(value="appId") String app_id, Pageable pageable){
        return service.getListLawCatByAppId(Integer.parseInt(app_id), pageable);
    }
}
