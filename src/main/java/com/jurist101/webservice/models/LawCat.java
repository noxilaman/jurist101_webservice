package com.jurist101.webservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Component
@Entity
@Table(name = "tb_lawcat")
public class LawCat {

    @Id
    @Column(name = "i_id")
    private int id;

    @Column(name = "app_id")
    private int appId;

    @ManyToOne
    @JoinColumn(name = "i_parent_id")
    private LawCat parent;

    @Column(name = "i_parent_id", insertable = false, updatable = false)
    private int iParentId;

    @Column(name = "i_seq")
    private int iSeq;

    @Column(name = "c_name")
    private String name;
    @Column(name = "c_desc")
    private String cDesc;
    @Column(name = "i_level")
    private int iLevel;
    private String c_law_code;

}
