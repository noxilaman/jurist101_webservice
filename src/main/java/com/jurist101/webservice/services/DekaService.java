package com.jurist101.webservice.services;

import com.jurist101.webservice.models.Deka;
import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.repositories.DekaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DekaService {

    @Autowired
    private DekaRepository repo;

    public Page<Deka> getAllDeka(Pageable pageable){
        return repo.findAll(pageable);
    }

    public Optional<Law> getDekaById(int id) {
        return repo.findById((long) id);
    }

    public Page<Deka> getDekaByLawId(int lawId, Pageable pageable) {
        return repo.findByLawId(lawId, pageable);
    }

    public Page<Deka> getDekaByKeyword(String keyword, Pageable pageable) {
        return repo.findByNameContaining(keyword, pageable);
    }
}
