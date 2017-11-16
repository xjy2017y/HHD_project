package com.hhd.pojo;

import java.util.Date;

public class QuestionInfo {
    private Integer questionid;

    private Integer userid;

    private String title;

    private String questioncontent;

    private Boolean questionstate;

    private Date questiontime;

    private Double hitcount;

    private Integer questiontype;

    private Integer grade;

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent == null ? null : questioncontent.trim();
    }

    public Boolean getQuestionstate() {
        return questionstate;
    }

    public void setQuestionstate(Boolean questionstate) {
        this.questionstate = questionstate;
    }

    public Date getQuestiontime() {
        return questiontime;
    }

    public void setQuestiontime(Date questiontime) {
        this.questiontime = questiontime;
    }

    public Double getHitcount() {
        return hitcount;
    }

    public void setHitcount(Double hitcount) {
        this.hitcount = hitcount;
    }

    public Integer getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(Integer questiontype) {
        this.questiontype = questiontype;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}