package com.jurist101.webservice.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainApp {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIos_id() {
        return ios_id;
    }

    public void setIos_id(String ios_id) {
        this.ios_id = ios_id;
    }

    public String getApp_img() {
        return app_img;
    }

    public void setApp_img(String app_img) {
        this.app_img = app_img;
    }

    public String getStore_id() {
        return store_id;
    }

    public void setStore_id(String store_id) {
        this.store_id = store_id;
    }

    public String getAndroid_id() {
        return android_id;
    }

    public void setAndroid_id(String android_id) {
        this.android_id = android_id;
    }

    public String getAndroid_store() {
        return android_store;
    }

    public void setAndroid_store(String android_store) {
        this.android_store = android_store;
    }

    public String getApp_desc() {
        return app_desc;
    }

    public void setApp_desc(String app_desc) {
        this.app_desc = app_desc;
    }

    public String getAndroid_desc() {
        return android_desc;
    }

    public void setAndroid_desc(String android_desc) {
        this.android_desc = android_desc;
    }

    public String getGroup_app() {
        return group_app;
    }

    public void setGroup_app(String group_app) {
        this.group_app = group_app;
    }

    public String getIcon_app() {
        return icon_app;
    }

    public void setIcon_app(String icon_app) {
        this.icon_app = icon_app;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    @Override
    public String toString() {
        return "MainApp{" +
                "name='" + name + '\'' +
                ", ios_id='" + ios_id + '\'' +
                ", app_img='" + app_img + '\'' +
                ", store_id='" + store_id + '\'' +
                ", android_id='" + android_id + '\'' +
                ", android_store='" + android_store + '\'' +
                ", app_desc='" + app_desc + '\'' +
                ", android_desc='" + android_desc + '\'' +
                ", group_app='" + group_app + '\'' +
                ", icon_app='" + icon_app + '\'' +
                ", short_name='" + short_name + '\'' +
                '}';
    }
}
