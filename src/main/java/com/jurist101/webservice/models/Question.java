package com.jurist101.webservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@Entity
@Table(name="questions")
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    private int id;
    @Column(name = "i_seq")
    private int seq;
    private String name;
    private String detail;
    private String answer;
    private String comments;
    @Column(name = "lawdata_id")
    private int lawId;
}
