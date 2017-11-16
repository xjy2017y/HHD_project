package com.hhd.pojo;

public class TyreInfo {
    private Integer tyreid;

    private String brand;

    private String streak;

    private String name;

    private String standard;

    private String loaded;

    private String speed;

    private String wearproof;

    private String traction;

    private String hightemperature;

    public Integer getTyreid() {
        return tyreid;
    }

    public void setTyreid(Integer tyreid) {
        this.tyreid = tyreid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getStreak() {
        return streak;
    }

    public void setStreak(String streak) {
        this.streak = streak == null ? null : streak.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getLoaded() {
        return loaded;
    }

    public void setLoaded(String loaded) {
        this.loaded = loaded == null ? null : loaded.trim();
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed == null ? null : speed.trim();
    }

    public String getWearproof() {
        return wearproof;
    }

    public void setWearproof(String wearproof) {
        this.wearproof = wearproof == null ? null : wearproof.trim();
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = traction == null ? null : traction.trim();
    }

    public String getHightemperature() {
        return hightemperature;
    }

    public void setHightemperature(String hightemperature) {
        this.hightemperature = hightemperature == null ? null : hightemperature.trim();
    }
}