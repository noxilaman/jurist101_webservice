package com.jurist101.webservice.services;

import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.repositories.LawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LawService {

    @Autowired
    private LawRepository repo;

    public Page<Law> getAllLaw(Pageable pageable){
        return repo.findAll(pageable);
    }

    public Page<Law> getAllLawsByAppId(int i, Pageable pageable) {
        return repo.findByAppId(i, pageable);
    }

    public Page<Law> getAllLawsByAppIdandCatId(int i, int i1, Pageable pageable) {
        return repo.findByAppIdAndCatId(i, i1, pageable);
    }

    public Page<Law> getAllLawsByAppIdandKeyword(int i, String keyword, Pageable pageable) {
        return repo.findByAppIdAndNameContaining(i, keyword, pageable);
    }

    public Optional<Law> getLawById(int i) {
        return repo.findById((long) i);
    }

    public Page<Law> getLawsByDekaId(int i, Pageable pageable) {
        return repo.findByDekaId(i, pageable);
    }
}
