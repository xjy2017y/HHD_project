package com.hhd.pojo;

public class Garage {
    private Integer garageid;

    private Integer userid;

    private Integer vechiclesid;

    private String caraddress;

    private String carnum;

    private String vehicleinum;

    private String enginenum;

    private Integer carstate = 0;

    private Integer carrentcount = 0;

    private Integer insurancetype = 0;

    public Integer getGarageid() {
        return garageid;
    }

    public void setGarageid(Integer garageid) {
        this.garageid = garageid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getVechiclesid() {
        return vechiclesid;
    }

    public void setVechiclesid(Integer vechiclesid) {
        this.vechiclesid = vechiclesid;
    }

    public String getCaraddress() {
        return caraddress;
    }

    public void setCaraddress(String caraddress) {
        this.caraddress = caraddress == null ? null : caraddress.trim();
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public String getVehicleinum() {
        return vehicleinum;
    }

    public void setVehicleinum(String vehicleinum) {
        this.vehicleinum = vehicleinum == null ? null : vehicleinum.trim();
    }

    public String getEnginenum() {
        return enginenum;
    }

    public void setEnginenum(String enginenum) {
        this.enginenum = enginenum == null ? null : enginenum.trim();
    }

    public Integer getCarstate() {
        return carstate;
    }

    public void setCarstate(Integer carstate) {
        this.carstate = carstate;
    }

    public Integer getCarrentcount() {
        return carrentcount;
    }

    public void setCarrentcount(Integer carrentcount) {
        this.carrentcount = carrentcount;
    }

    public Integer getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(Integer insurancetype) {
        this.insurancetype = insurancetype;
    }
}