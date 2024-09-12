package com.jurist101.webservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Component
@Entity
@Table(name="users")
public class User {

    @Id
    private int id;
    private String username;
    private String email;
    private String password;
    private String auth_key;
    private Integer  confirmed_at;
    private String unconfirmed_email;
    private Integer  blocked_at;
    private String  registration_ip;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Integer flags;
    private Timestamp last_login_at;
    private Integer  i_role;
    private String name;

}
