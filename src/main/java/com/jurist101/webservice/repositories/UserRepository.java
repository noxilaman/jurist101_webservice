package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users",path = "users")
public interface UserRepository extends PagingAndSortingRepository<User,Long>, CrudRepository<User,Long> {
    User findByUsername(String username);
}
