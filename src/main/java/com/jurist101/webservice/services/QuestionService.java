package com.jurist101.webservice.services;

import com.jurist101.webservice.models.Question;
import com.jurist101.webservice.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository repo;

    public Page<Question> getAllQuestions(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public Page<Question> getQuestionsByLawId(int i, Pageable pageable) {
        return repo.findByLawId(i, pageable);
    }
}
