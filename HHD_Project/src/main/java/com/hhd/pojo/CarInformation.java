package com.hhd.pojo;

import java.util.Date;

public class CarInformation {
    private Integer infoid;

    private String title;

    private String content;

    private String linkpath;

    private String author;

    private Integer hitcount;

    private Date publishdate;

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getLinkpath() {
        return linkpath;
    }

    public void setLinkpath(String linkpath) {
        this.linkpath = linkpath == null ? null : linkpath.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getHitcount() {
        return hitcount;
    }

    public void setHitcount(Integer hitcount) {
        this.hitcount = hitcount;
    }

    public Date getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(Date publishdate) {
        this.publishdate = publishdate;
    }
}