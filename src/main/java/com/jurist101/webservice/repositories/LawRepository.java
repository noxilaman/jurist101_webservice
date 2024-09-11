package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Law;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


//@RepositoryRestResource(collectionResourceRel = "law", path = "law")
public interface LawRepository extends PagingAndSortingRepository<Law, Long>,CrudRepository<Law,Long> {
    //List<Law> findByAppId(@Param("AppId") int app_id);
}
