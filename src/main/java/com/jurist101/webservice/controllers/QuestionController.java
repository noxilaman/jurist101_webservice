package com.jurist101.webservice.controllers;

import com.jurist101.webservice.models.Question;
import com.jurist101.webservice.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("questions")
    public Page<Question> getAllQuestions(Pageable pageable){
        return questionService.getAllQuestions(pageable);
    }

    @GetMapping("questions/law/{lawid}")
    public Page<Question> getQuestionsByLawId(@PathVariable(value="lawid") String lawid, Pageable pageable){
        return questionService.getQuestionsByLawId(Integer.parseInt(lawid),pageable);
    }

}
