package com.jurist101.webservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Table(name="tb_deka")
@Entity
public class Deka {
    @Id
    private int id;

    @Column(name = "i_no")
    private int no;
    @Column(name = "i_subno")
    private int subno;
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_desc")
    private String desc;
    @Column(name = "c_comments")
    private String comments;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "tb_deka_law",
            joinColumns = {
                    @JoinColumn(name = "deka_id", referencedColumnName = "id",
                            nullable = true,insertable=false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "lawdata_id", referencedColumnName = "i_id",
                            nullable = true,insertable=false, updatable = false)})
    private List<Law> laws;
}
