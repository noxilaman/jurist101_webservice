package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Law;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawRepository extends JpaRepository<Law,Integer> {
}
