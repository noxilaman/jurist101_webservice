package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Law;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "law", path = "law")
public interface LawRepository extends PagingAndSortingRepository<Law, Long>,CrudRepository<Law,Long> {
}
