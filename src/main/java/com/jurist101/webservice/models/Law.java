package com.jurist101.webservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@Entity
@Table(name="tb_lawdata")
@NoArgsConstructor
@AllArgsConstructor
public class Law {
    @Id
    private int i_id;
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

    @ManyToOne
    @JoinColumn(name = "app_id")
    private MainApp mainapp;
}
