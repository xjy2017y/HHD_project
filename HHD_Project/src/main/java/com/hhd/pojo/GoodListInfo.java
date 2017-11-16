package com.hhd.pojo;

import java.util.Date;

public class GoodListInfo {
    private Integer goodlistid;

    private Integer userid;

    private Integer shopid;

    private Date buildtime;

    public Integer getGoodlistid() {
        return goodlistid;
    }

    public void setGoodlistid(Integer goodlistid) {
        this.goodlistid = goodlistid;
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

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }
}