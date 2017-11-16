package com.hhd.pojo;

import java.sql.Timestamp;

public class TestInfo {
    private Integer testid;

    private Integer linkedid;

    private Double testtyrepress;

    private Double testtem;

    private Timestamp testtime;

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public Integer getLinkedid() {
        return linkedid;
    }

    public void setLinkedid(Integer linkedid) {
        this.linkedid = linkedid;
    }

    public Double getTesttyrepress() {
        return testtyrepress;
    }

    public void setTesttyrepress(Double testtyrepress) {
        this.testtyrepress = testtyrepress;
    }

    public Double getTesttem() {
        return testtem;
    }

    public void setTesttem(Double testtem) {
        this.testtem = testtem;
    }

	public Timestamp getTesttime() {
		return testtime;
	}

	public void setTesttime(Timestamp testtime) {
		this.testtime = testtime;
	}

   
}