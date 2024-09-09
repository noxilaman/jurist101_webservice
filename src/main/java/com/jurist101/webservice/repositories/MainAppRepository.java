package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.MainApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MainAppRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<MainApp> findAll() {

        String sql = "select * fro tb_app";

        RowMapper<MainApp> rm = new RowMapper<MainApp>() {
            @Override
            public MainApp mapRow(ResultSet rs, int rowNum) throws SQLException {

                MainApp m = new MainApp();
                m.setName(rs.getString("name"));

                return m;
            }
        };

        return jdbc.query(sql,rm);
    }

   ; public List<MainApp> findAllByType(String typeName) {
        List<MainApp> mainApps = new ArrayList<>();
        return mainApps;
    }
}
