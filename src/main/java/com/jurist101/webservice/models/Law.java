package com.jurist101.webservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@Entity
@Table(name="tb_lawdata")
@NoArgsConstructor
@AllArgsConstructor
public class Law {
    @Id
    private int i_id;
    @Column(name = "i_no")
    private int no;
    @Column(name = "i_subno")
    private int subno;
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_desc")
    private String desc;
    @Column(name = "c_comment")
    private String comment;
    private String c_url;
    @Column(name = "i_lawcat")
    private int catId;
    private int i_lawno;
    private String important_keys;
    private String internal_factor;
    private String external_factor;
    private String short_note;

    @ManyToOne
    @JoinColumn(name = "app_id")
    private MainApp mainapp;

    @Column(name = "app_id", insertable = false, updatable = false)
    private int appId;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_deka_law",
            joinColumns = {
                    @JoinColumn(name = "lawdata_id", referencedColumnName = "i_id",
                            nullable = true,insertable=false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "deka_id", referencedColumnName = "id",
                            nullable = true,insertable=false, updatable = false)})
    private List<Deka> dekas;
}
