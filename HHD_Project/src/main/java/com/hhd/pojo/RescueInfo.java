package com.hhd.pojo;

import java.util.Date;

public class RescueInfo {
    private Integer rescueid;

    private Integer userid;

    private Integer shopid;

    private Integer orderid;

    private String problemdespribe;

    private String address;

    private Double pay;

    private Date starttime;

    private Date servicetime;

    private String serviceevalution;

    public Integer getRescueid() {
        return rescueid;
    }

    public void setRescueid(Integer rescueid) {
        this.rescueid = rescueid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getProblemdespribe() {
        return problemdespribe;
    }

    public void setProblemdespribe(String problemdespribe) {
        this.problemdespribe = problemdespribe == null ? null : problemdespribe.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getServicetime() {
        return servicetime;
    }

    public void setServicetime(Date servicetime) {
        this.servicetime = servicetime;
    }

    public String getServiceevalution() {
        return serviceevalution;
    }

    public void setServiceevalution(String serviceevalution) {
        this.serviceevalution = serviceevalution == null ? null : serviceevalution.trim();
    }
}