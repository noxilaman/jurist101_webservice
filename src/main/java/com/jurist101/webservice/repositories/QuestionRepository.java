package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface QuestionRepository extends PagingAndSortingRepository<Question,Integer>, CrudRepository<Question,Integer>, JpaRepository<Question, Integer> {

    Page<Question> findByLawId(int i, Pageable pageable);
}
