package com.hhd.pojo;

import java.util.Date;

public class AnserInfo {
    private Integer answerid;

    private Integer userid;

    private Integer questionid;

    private String content;

    private Date buildtime;

    private Boolean isbetter;

    private Integer parentid;

    private Integer targetUserid;

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

    public Boolean getIsbetter() {
        return isbetter;
    }

    public void setIsbetter(Boolean isbetter) {
        this.isbetter = isbetter;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getTargetUserid() {
        return targetUserid;
    }

    public void setTargetUserid(Integer targetUserid) {
        this.targetUserid = targetUserid;
    }
}