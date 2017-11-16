package com.hhd.pojo;

import java.util.Date;

public class BoughtInfo {
    private Integer boughtid;

    private Integer userid;

    private Integer goodlistid;

    private Date boughttime;

    private Double rank;

    private String evaluate;

    private String shopfeedback;

    public Integer getBoughtid() {
        return boughtid;
    }

    public void setBoughtid(Integer boughtid) {
        this.boughtid = boughtid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodlistid() {
        return goodlistid;
    }

    public void setGoodlistid(Integer goodlistid) {
        this.goodlistid = goodlistid;
    }

    public Date getBoughttime() {
        return boughttime;
    }

    public void setBoughttime(Date boughttime) {
        this.boughttime = boughttime;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public String getShopfeedback() {
        return shopfeedback;
    }

    public void setShopfeedback(String shopfeedback) {
        this.shopfeedback = shopfeedback == null ? null : shopfeedback.trim();
    }
}