package com.jurist101.webservice.services;

import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.repositories.LawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawService {

    @Autowired
    private LawRepository repo;

    public List<Law> getAllLaw(){
        return repo.findAll();
    }
}
