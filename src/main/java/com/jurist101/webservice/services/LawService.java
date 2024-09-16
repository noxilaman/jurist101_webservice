package com.jurist101.webservice.services;

import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.repositories.LawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawService {

    @Autowired
    private LawRepository repo;

    public Page<Law> getAllLaw(Pageable pageable){
        return repo.findAll(pageable);
    }

}
