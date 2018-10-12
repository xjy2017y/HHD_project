package com.hhd.pojo;

import java.sql.Timestamp;

public class UserInfo {
    private Integer userid;

    private String assphone;

    private Integer usertype = 1;

    private String nickname;

    private String idcard;

    private String note;

    private Integer grade = 0;

    private Integer cumlogindays = 1;

    private Integer conlogindays = 1;

    private Timestamp lastlogintime;
    
    private Integer superiorid;

    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getSuperiorid() {
		return superiorid;
	}
	public void setSuperiorid(Integer superiorid) {
		this.superiorid = superiorid;
	}
	public Timestamp getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Timestamp lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public Integer getUserid() {
        return userid;
    }
	public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAssphone() {
        return assphone;
    }

    public void setAssphone(String assphone) {
        this.assphone = assphone == null ? null : assphone.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getCumlogindays() {
        return cumlogindays;
    }

    public void setCumlogindays(Integer cumlogindays) {
        this.cumlogindays = cumlogindays;
    }

    public Integer getConlogindays() {
        return conlogindays;
    }

    public void setConlogindays(Integer conlogindays) {
        this.conlogindays = conlogindays;
    }

}