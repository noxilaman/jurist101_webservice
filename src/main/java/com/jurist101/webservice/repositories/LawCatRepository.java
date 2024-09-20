package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.LawCat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LawCatRepository extends PagingAndSortingRepository<LawCat, Integer>, CrudRepository<LawCat, Integer>, JpaRepository<LawCat, Integer> {
    Page<LawCat> findByAppId(int appid, Pageable pageable);

}
