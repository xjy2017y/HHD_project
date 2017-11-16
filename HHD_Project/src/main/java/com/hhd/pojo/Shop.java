package com.hhd.pojo;

import java.util.List;

public class Shop {
    private Integer shopid;

    private Integer userid;

    private Double grade = 3.5;		//初级设定

    private Integer serviceitem;

    private String address;

    private Double viewcount = 0.0;

    private String describeinfo;

    private String note;

    private String phone;

    private Integer shopstate = 0;	//shop初始设定
    
    private Integer shopcheckstate = 0; //初始设定为未审核
    
    private List<String> pictureAddress;

    public Integer getShopcheckstate() {
		return shopcheckstate;
	}

	public void setShopcheckstate(Integer shopcheckstate) {
		this.shopcheckstate = shopcheckstate;
	}

	public List<String> getPictureAddress() {
		return pictureAddress;
	}

	public void setPictureAddress(List<String> pictureAddress) {
		this.pictureAddress = pictureAddress;
	}

	public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getServiceitem() {
        return serviceitem;
    }

    public void setServiceitem(Integer serviceitem) {
        this.serviceitem = serviceitem;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getViewcount() {
        return viewcount;
    }

    public void setViewcount(Double viewcount) {
        this.viewcount = viewcount;
    }

    public String getDescribeinfo() {
        return describeinfo;
    }

    public void setDescribeinfo(String describeinfo) {
        this.describeinfo = describeinfo == null ? null : describeinfo.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getShopstate() {
        return shopstate;
    }

    public void setShopstate(Integer shopstate) {
        this.shopstate = shopstate;
    }
}