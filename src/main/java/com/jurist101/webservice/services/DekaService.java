package com.jurist101.webservice.services;

import com.jurist101.webservice.models.Deka;
import com.jurist101.webservice.repositories.DekaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DekaService {

    @Autowired
    private DekaRepository repo;

    public List<Deka> getAllDaka(){
        return null;
    }
}
