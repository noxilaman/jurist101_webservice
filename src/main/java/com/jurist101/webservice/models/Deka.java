package com.jurist101.webservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name="tb_deka")
@Entity
public class Deka {
    @Id
    private int id;
    private int i_no;
    private int i_subno;
    private String c_name;
    private String c_desc;
    private String c_comments;
}
