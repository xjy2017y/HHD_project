package com.hhd.pojo;

public class CommodityInfo {
    private Integer commodityid;

    private Integer shopid;

    private Integer servicetype;

    private String servicedescribe;

    private Double serviceprice;

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getServicetype() {
        return servicetype;
    }

    public void setServicetype(Integer servicetype) {
        this.servicetype = servicetype;
    }

    public String getServicedescribe() {
        return servicedescribe;
    }

    public void setServicedescribe(String servicedescribe) {
        this.servicedescribe = servicedescribe == null ? null : servicedescribe.trim();
    }

    public Double getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(Double serviceprice) {
        this.serviceprice = serviceprice;
    }
}