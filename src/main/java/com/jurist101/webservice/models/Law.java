package com.jurist101.webservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="tb_lawdata")
@NoArgsConstructor
@AllArgsConstructor
public class Law {
    @Id
    private int i_id;
    private int app_id;
    private int i_no;
    private int i_subno;
    private String c_name;
    private String c_desc;
    private String c_comment;
    private String c_url;
    private int i_lawcat;
    private int i_lawno;
    private String important_keys;
    private String internal_factor;
    private String external_factor;
    private String short_note;
}
