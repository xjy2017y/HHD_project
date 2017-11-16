package com.hhd.pojo;

import java.util.Date;

public class Advertisement {
    private Integer adid;

    private String imagepath;

    private String discrible;

    private String linkpath;

    private Integer shopid;

    private Integer hitcount;

    private Date startdate;

    private Date enddate;

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath == null ? null : imagepath.trim();
    }

    public String getDiscrible() {
        return discrible;
    }

    public void setDiscrible(String discrible) {
        this.discrible = discrible == null ? null : discrible.trim();
    }

    public String getLinkpath() {
        return linkpath;
    }

    public void setLinkpath(String linkpath) {
        this.linkpath = linkpath == null ? null : linkpath.trim();
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getHitcount() {
        return hitcount;
    }

    public void setHitcount(Integer hitcount) {
        this.hitcount = hitcount;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}