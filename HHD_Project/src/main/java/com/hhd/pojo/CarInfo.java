package com.hhd.pojo;

public class CarInfo {
    private Integer vechiclesid;

    private String series;

    private String brand;

    private String cartype;

    private String peoplenum;

    private String markettime;

    private String engine;

    private String displacement;

    private String firstLatter;

    private String model;

    public Integer getVechiclesid() {
        return vechiclesid;
    }

    public void setVechiclesid(Integer vechiclesid) {
        this.vechiclesid = vechiclesid;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(String peoplenum) {
        this.peoplenum = peoplenum == null ? null : peoplenum.trim();
    }

    public String getMarkettime() {
        return markettime;
    }

    public void setMarkettime(String markettime) {
        this.markettime = markettime == null ? null : markettime.trim();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement == null ? null : displacement.trim();
    }

    public String getFirstLatter() {
        return firstLatter;
    }

    public void setFirstLatter(String firstLatter) {
        this.firstLatter = firstLatter == null ? null : firstLatter.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
}