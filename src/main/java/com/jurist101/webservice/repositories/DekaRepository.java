package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Deka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Deka", path = "deka")
public interface DekaRepository extends PagingAndSortingRepository<Deka,Integer>, CrudRepository<Deka,Integer> {
}
