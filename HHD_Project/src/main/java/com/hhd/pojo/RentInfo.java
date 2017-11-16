package com.hhd.pojo;

import java.util.Date;

public class RentInfo {
    private Integer rentid;

    private Integer userid;

    private Integer garageid;

    private Date starttime;

    private Date endtime;

    private Double price;

    private Double deposit;

    private Double actualpay;

    public Integer getRentid() {
        return rentid;
    }

    public void setRentid(Integer rentid) {
        this.rentid = rentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGarageid() {
        return garageid;
    }

    public void setGarageid(Integer garageid) {
        this.garageid = garageid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getActualpay() {
        return actualpay;
    }

    public void setActualpay(Double actualpay) {
        this.actualpay = actualpay;
    }
}