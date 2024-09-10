package com.jurist101.webservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "tb_app")
public class MainApp {

    @Id
    private int id;
    private String name;
    private String ios_id;
    private String app_img;
    private String store_id;
    private String android_id;
    private String android_store;
    private String app_desc;
    private String android_desc;
    private String group_app;
    private String icon_app;
    private String short_name;

}
