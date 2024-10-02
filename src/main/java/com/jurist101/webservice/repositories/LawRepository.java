package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Law;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


//@RepositoryRestResource(collectionResourceRel = "law", path = "law")
public interface LawRepository extends PagingAndSortingRepository<Law, Long>,CrudRepository<Law,Long> {
    @Query("SELECT l FROM Law l WHERE l.appId = :i ORDER BY l.no ASC,l.subno ASC")
    Page<Law> findByAppId(int i, Pageable pageable);

    @Query("SELECT l FROM Law l WHERE l.appId = :i and l.catId = :i1 ORDER BY l.no ASC,l.subno ASC")
    Page<Law> findByAppIdAndCatId(int i, int i1, Pageable pageable);

    @Query("SELECT l FROM Law l WHERE l.appId = :i and (l.name like '%:keyword%' or l.desc like '%:keyword%' or l.comment like '%:keyword%' or  l.no = :keyword or  l.subno = :keyword)  ORDER BY l.no ASC,l.subno ASC")
    Page<Law> findByAppIdAndNameContaining(int i, String keyword, Pageable pageable);

    @Query("SELECT l FROM Law l JOIN l.dekas d WHERE d.id = :i")
    Page<Law> findByDekaId(int i, Pageable pageable);
    //List<Law> findByAppId(@Param("AppId") int app_id);SELECT u FROM User u WHERE u.email LIKE '%email1%'
    //    or  u.email LIKE '%email2%'
}
