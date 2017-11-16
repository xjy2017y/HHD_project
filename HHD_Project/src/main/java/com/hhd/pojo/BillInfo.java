package com.hhd.pojo;

import java.util.Date;

public class BillInfo {
    private Integer billid;

    private Integer commodityid;

    private Integer num;

    private Integer billstate;

    private Date billtime;

    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getBillstate() {
        return billstate;
    }

    public void setBillstate(Integer billstate) {
        this.billstate = billstate;
    }

    public Date getBilltime() {
        return billtime;
    }

    public void setBilltime(Date billtime) {
        this.billtime = billtime;
    }
}