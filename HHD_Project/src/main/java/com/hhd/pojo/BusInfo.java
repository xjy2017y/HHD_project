package com.hhd.pojo;

import java.util.Date;

public class BusInfo {
    private Integer busid;

    private String series;

    private String pressure;

    private String temperature;

    private String sensornum;

    private String recognitionnum;

    private String sensorstatus;

    private String longitude;

    private String eastOrWest;

    private String latitude;

    private String northOrSourth;

    private String altitude;

    private String speed;

    private Date recordTime;

    public Integer getBusid() {
        return busid;
    }

    public void setBusid(Integer busid) {
        this.busid = busid;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series == null ? null : series.trim();
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure == null ? null : pressure.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getSensornum() {
        return sensornum;
    }

    public void setSensornum(String sensornum) {
        this.sensornum = sensornum == null ? null : sensornum.trim();
    }

    public String getRecognitionnum() {
        return recognitionnum;
    }

    public void setRecognitionnum(String recognitionnum) {
        this.recognitionnum = recognitionnum == null ? null : recognitionnum.trim();
    }

    public String getSensorstatus() {
        return sensorstatus;
    }

    public void setSensorstatus(String sensorstatus) {
        this.sensorstatus = sensorstatus == null ? null : sensorstatus.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getEastOrWest() {
        return eastOrWest;
    }

    public void setEastOrWest(String eastOrWest) {
        this.eastOrWest = eastOrWest == null ? null : eastOrWest.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getNorthOrSourth() {
        return northOrSourth;
    }

    public void setNorthOrSourth(String northOrSourth) {
        this.northOrSourth = northOrSourth == null ? null : northOrSourth.trim();
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude == null ? null : altitude.trim();
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed == null ? null : speed.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}