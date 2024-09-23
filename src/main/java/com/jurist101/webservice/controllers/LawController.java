package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.services.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LawController {

    @Autowired
    private LawService service;

    @GetMapping("laws/app/{appId}")
    public Page<Law> getAllLawsByAppId(@PathVariable(value="appId") String appId, Pageable pageable){
        return service.getAllLawsByAppId(Integer.parseInt(appId),pageable);
    }

    @GetMapping("laws/app/{appId}/cat/{catId}")
    public Page<Law> getAllLawsByAppIdandCatId(@PathVariable(value="appId") String appId,@PathVariable(value="catId") String catId, Pageable pageable){
        return service.getAllLawsByAppIdandCatId(Integer.parseInt(appId),Integer.parseInt(catId),pageable);
    }

    @GetMapping("laws/app/{appId}/search/{keyword}")
    public Page<Law> getAllLawsByAppIdandCatId(@PathVariable(value="appId") String appId,@PathVariable(value="keyword") String keyword, Pageable pageable){
        return service.getAllLawsByAppIdandCatId(Integer.parseInt(appId),Integer.parseInt(catId),pageable);
    }
}
