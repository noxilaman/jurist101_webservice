package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.Deka;
import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.services.DekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DekaController {

    @Autowired
    private DekaService service;

    @GetMapping("dekas")
    public Page<Deka> getAll(Pageable pageable){
        return service.getAllDeka(pageable);
    }

    @GetMapping("deka/{id}")
    public Optional<Law> getDekaById(int id){
        return service.getDekaById(id);
    }

    @GetMapping("dekas/law/{law_id}")
    public Page<Deka> getDekaByLawId(@PathVariable(value="law_id") String law_id, Pageable pageable){
        return service.getDekaByLawId(Integer.parseInt(law_id), pageable);
    }

    @GetMapping("dekas/search/{keyword}")
    public Page<Deka> getDekaByKeyword(@PathVariable(value="keyword") String keyword, Pageable pageable){
        return service.getDekaByKeyword(keyword, pageable);
    }
}
