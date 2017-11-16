package com.hhd.pojo;

public class CarLinkTyreInfo {
    private Integer linkedid;

    private Integer garageid;

    private Integer tyreid;

    private Integer tyreposition;

    private Double tyrealertupper = 0.0;

    private Double tyrealertlower = 0.0;

    private Double mileage = 0.0;

    public Integer getLinkedid() {
        return linkedid;
    }

    public void setLinkedid(Integer linkedid) {
        this.linkedid = linkedid;
    }

    public Integer getGarageid() {
        return garageid;
    }

    public void setGarageid(Integer garageid) {
        this.garageid = garageid;
    }

    public Integer getTyreid() {
        return tyreid;
    }

    public void setTyreid(Integer tyreid) {
        this.tyreid = tyreid;
    }

    public Integer getTyreposition() {
        return tyreposition;
    }

    public void setTyreposition(Integer tyreposition) {
        this.tyreposition = tyreposition;
    }

    public Double getTyrealertupper() {
        return tyrealertupper;
    }

    public void setTyrealertupper(Double tyrealertupper) {
        this.tyrealertupper = tyrealertupper;
    }

    public Double getTyrealertlower() {
        return tyrealertlower;
    }

    public void setTyrealertlower(Double tyrealertlower) {
        this.tyrealertlower = tyrealertlower;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
}