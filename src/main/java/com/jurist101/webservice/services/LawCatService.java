package com.jurist101.webservice.services;

import com.jurist101.webservice.models.LawCat;
import com.jurist101.webservice.repositories.LawCatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LawCatService {

    @Autowired
    private LawCatRepository repo;

    public Page<LawCat> getListLawCatByAppId(int i, Pageable pageable) {
        return repo.findByAppId(i, pageable);
    }

    public Page<LawCat> getListLawCatByCatId(int i, Pageable pageable) {
        return repo.findByParentId(i, pageable);
    }

    public Page<LawCat> getListLawCatByAppIdandKeyword(int i, String keyword, Pageable pageable) {
        return repo.findByAppIdAndNameContaining(i, keyword, pageable);
    }
}
