package com.hhd.pojo;

import java.util.Date;

public class ServiceInfo {
    private Integer startid;

    private Integer userid;

    private String address;

    private Date starttime;

    private String content;

    private Integer startstate;

    public Integer getStartid() {
        return startid;
    }

    public void setStartid(Integer startid) {
        this.startid = startid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getStartstate() {
        return startstate;
    }

    public void setStartstate(Integer startstate) {
        this.startstate = startstate;
    }
}