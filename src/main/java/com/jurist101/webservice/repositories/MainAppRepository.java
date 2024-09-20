package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.MainApp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface MainAppRepository extends PagingAndSortingRepository<MainApp, Integer>, CrudRepository<MainApp, Integer>, JpaRepository<MainApp, Integer> {
    Page<MainApp> findByGroupApp(String groupName, Pageable pageable);

    Page<MainApp> findByNameContaining(String keyword, Pageable pageable);
}
