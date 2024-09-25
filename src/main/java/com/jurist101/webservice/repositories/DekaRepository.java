package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Deka;
import com.jurist101.webservice.models.Law;
import com.jurist101.webservice.models.LawCat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface DekaRepository extends PagingAndSortingRepository<Deka,Integer>, CrudRepository<Deka,Integer>, JpaRepository<Deka, Integer> {
    @Query("SELECT l FROM Deka l ORDER BY l.no ASC,l.subno ASC")
    Page<Deka> findAll(Pageable pageable);

    Optional<Law> findById(long id);

    @Query("SELECT d FROM Deka d JOIN d.laws l WHERE l.i_id = :lawId")
    Page<Deka> findByLawId(int lawId, Pageable pageable);
}
