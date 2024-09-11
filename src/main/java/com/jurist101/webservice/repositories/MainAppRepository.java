package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.MainApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "mainapp",path = "mainapp")
public interface MainAppRepository extends PagingAndSortingRepository<MainApp, Integer>, CrudRepository<MainApp, Integer> {
}
