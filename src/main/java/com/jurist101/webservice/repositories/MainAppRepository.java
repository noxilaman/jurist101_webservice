package com.jurist101.webservice.repositories;

import com.jurist101.webservice.models.MainApp;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MainAppRepository {

    public List<MainApp> findAll() {
        List<MainApp> mainApps = new ArrayList<>();
        return mainApps;
    }

    public List<MainApp> findAllByType(String typeName) {
        List<MainApp> mainApps = new ArrayList<>();
        return mainApps;
    }
}
